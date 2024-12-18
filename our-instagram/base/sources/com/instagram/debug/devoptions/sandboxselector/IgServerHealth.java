package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.C14360o3;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public abstract class IgServerHealth {
    public final String healthStatusString;

    /* loaded from: classes11.dex */
    public final class CheckingHealth extends IgServerHealth {
        public static final CheckingHealth INSTANCE = new CheckingHealth();

        public CheckingHealth() {
            super("CHECKING_HEALTH");
        }
    }

    /* loaded from: classes11.dex */
    public final class Healthy extends IgServerHealth {
        public static final Healthy INSTANCE = new Healthy();

        public Healthy() {
            super("HEALTHY");
        }
    }

    /* loaded from: classes11.dex */
    public final class Unhealthy extends IgServerHealth {
        public final UnhealthyReason errorStatus;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes11.dex */
        public final class UnhealthyReason {
            public static final /* synthetic */ EnumEntries $ENTRIES;
            public static final /* synthetic */ UnhealthyReason[] $VALUES;
            public static final Companion Companion;
            public static final UnhealthyReason BAD_GATEWAY = new UnhealthyReason("BAD_GATEWAY", 0);
            public static final UnhealthyReason TIMED_OUT = new UnhealthyReason("TIMED_OUT", 1);
            public static final UnhealthyReason DJANGO_UNHEALTHY = new UnhealthyReason("DJANGO_UNHEALTHY", 2);
            public static final UnhealthyReason UNKNOWN = new UnhealthyReason("UNKNOWN", 3);

            public static final /* synthetic */ UnhealthyReason[] $values() {
                return new UnhealthyReason[]{BAD_GATEWAY, TIMED_OUT, DJANGO_UNHEALTHY, UNKNOWN};
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public final UnhealthyReason fromHttpStatusCode(int i) {
                    switch (i) {
                        case 502:
                            return UnhealthyReason.BAD_GATEWAY;
                        case 503:
                            return UnhealthyReason.TIMED_OUT;
                        case 504:
                            return UnhealthyReason.DJANGO_UNHEALTHY;
                        default:
                            return UnhealthyReason.UNKNOWN;
                    }
                }

                public Companion() {
                }
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason$Companion] */
            static {
                UnhealthyReason[] $values = $values();
                $VALUES = $values;
                $ENTRIES = AbstractC12190kN.A00($values);
                Companion = new Object();
            }

            public static UnhealthyReason valueOf(String str) {
                return (UnhealthyReason) Enum.valueOf(UnhealthyReason.class, str);
            }

            public static UnhealthyReason[] values() {
                return (UnhealthyReason[]) $VALUES.clone();
            }

            public UnhealthyReason(String str, int i) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unhealthy(UnhealthyReason unhealthyReason) {
            super("UNHEALTHY");
            C14360o3.A0B(unhealthyReason, 1);
            this.errorStatus = unhealthyReason;
        }

        public final UnhealthyReason component1() {
            return this.errorStatus;
        }

        public final Unhealthy copy(UnhealthyReason unhealthyReason) {
            C14360o3.A0B(unhealthyReason, 0);
            return new Unhealthy(unhealthyReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unhealthy) && this.errorStatus == ((Unhealthy) obj).errorStatus);
        }

        public int hashCode() {
            return this.errorStatus.hashCode();
        }

        public static /* synthetic */ Unhealthy copy$default(Unhealthy unhealthy, UnhealthyReason unhealthyReason, int i, Object obj) {
            if ((i & 1) != 0) {
                unhealthyReason = unhealthy.errorStatus;
            }
            C14360o3.A0B(unhealthyReason, 0);
            return new Unhealthy(unhealthyReason);
        }

        public final UnhealthyReason getErrorStatus() {
            return this.errorStatus;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhealthy(errorStatus=");
            return AbstractC167017dG.A0o(this.errorStatus, sb);
        }
    }

    public /* synthetic */ IgServerHealth(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getHealthStatusString() {
        return this.healthStatusString;
    }

    public IgServerHealth(String str) {
        this.healthStatusString = str;
    }
}
