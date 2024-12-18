package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC09560e7;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC23611Dp;
import X.AbstractC52922bZ;
import X.AbstractC61132qb;
import X.C008002u;
import X.C05A;
import X.C0T6;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C14360o3;
import X.C16930sl;
import X.C19L;
import X.C1JX;
import X.C4A7;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RepositoryInfoViewModel extends AbstractC52922bZ {
    public static final int $stable = 8;
    public final C05A _repositories;
    public final C0UO repositories;
    public final UserSession session;

    @DebugMetadata(c = "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1", f = "RepositoryInfoViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int label;

        public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds) {
            super(2, interfaceC23621Ds);
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass1(interfaceC23621Ds);
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass1(interfaceC23621Ds).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC09560e7.A00(obj);
                } else {
                    throw AbstractC166987dD.A13();
                }
            } else {
                AbstractC09560e7.A00(obj);
                RepositoryInfoViewModel repositoryInfoViewModel = RepositoryInfoViewModel.this;
                C05A c05a = repositoryInfoViewModel._repositories;
                List A02 = repositoryInfoViewModel.session.A02();
                ArrayList<C4A7> A1E = AbstractC166987dD.A1E();
                for (Object obj2 : A02) {
                    if (obj2 instanceof C4A7) {
                        A1E.add(obj2);
                    }
                }
                ArrayList A0q = AbstractC167017dG.A0q(A1E);
                for (C4A7 c4a7 : A1E) {
                    String simpleName = c4a7.getClass().getSimpleName();
                    if (simpleName == null) {
                        simpleName = "unknown";
                    }
                    A0q.add(new RepositoryInfo(simpleName, c4a7.A00, null));
                }
                this.label = 1;
                if (c05a.emit(A0q, this) == c1jx) {
                    return c1jx;
                }
            }
            return C0eB.A00;
        }
    }

    /* loaded from: classes5.dex */
    public final class Factory extends AbstractC61132qb {
        public static final int $stable = 8;
        public final UserSession userSession;

        public Factory(UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            this.userSession = userSession;
        }

        @Override // X.AbstractC61132qb
        public /* bridge */ /* synthetic */ AbstractC52922bZ create() {
            return new RepositoryInfoViewModel(this.userSession);
        }

        @Override // X.AbstractC61132qb
        public RepositoryInfoViewModel create() {
            return new RepositoryInfoViewModel(this.userSession);
        }
    }

    /* loaded from: classes5.dex */
    public final class MemoryCacheStats extends C0T6 {
        public static final int $stable = 0;
        public final int evictionCount;
        public final int hitCount;
        public final int missCount;
        public final int putCount;

        public final int component1() {
            return this.hitCount;
        }

        public final int component2() {
            return this.missCount;
        }

        public final int component3() {
            return this.putCount;
        }

        public final int component4() {
            return this.evictionCount;
        }

        public final MemoryCacheStats copy(int i, int i2, int i3, int i4) {
            return new MemoryCacheStats(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MemoryCacheStats) {
                    MemoryCacheStats memoryCacheStats = (MemoryCacheStats) obj;
                    if (this.hitCount != memoryCacheStats.hitCount || this.missCount != memoryCacheStats.missCount || this.putCount != memoryCacheStats.putCount || this.evictionCount != memoryCacheStats.evictionCount) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((this.hitCount * 31) + this.missCount) * 31) + this.putCount) * 31) + this.evictionCount;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ MemoryCacheStats copy$default(MemoryCacheStats memoryCacheStats, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = memoryCacheStats.hitCount;
            }
            if ((i5 & 2) != 0) {
                i2 = memoryCacheStats.missCount;
            }
            if ((i5 & 4) != 0) {
                i3 = memoryCacheStats.putCount;
            }
            if ((i5 & 8) != 0) {
                i4 = memoryCacheStats.evictionCount;
            }
            return new MemoryCacheStats(i, i2, i3, i4);
        }

        public MemoryCacheStats(int i, int i2, int i3, int i4) {
            this.hitCount = i;
            this.missCount = i2;
            this.putCount = i3;
            this.evictionCount = i4;
        }

        public final int getEvictionCount() {
            return this.evictionCount;
        }

        public final int getHitCount() {
            return this.hitCount;
        }

        public final int getMissCount() {
            return this.missCount;
        }

        public final int getPutCount() {
            return this.putCount;
        }

        public /* synthetic */ MemoryCacheStats(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
        }

        public MemoryCacheStats() {
            this(0, 0, 0, 0);
        }
    }

    /* loaded from: classes5.dex */
    public final class RepositoryInfo extends C0T6 {
        public static final int $stable = 0;
        public final String featureTag;
        public final MemoryCacheStats memoryCacheStats;
        public final String name;

        public static /* synthetic */ RepositoryInfo copy$default(RepositoryInfo repositoryInfo, String str, String str2, MemoryCacheStats memoryCacheStats, int i, Object obj) {
            if ((i & 1) != 0) {
                str = repositoryInfo.name;
            }
            if ((i & 2) != 0) {
                str2 = repositoryInfo.featureTag;
            }
            if ((i & 4) != 0) {
                memoryCacheStats = repositoryInfo.memoryCacheStats;
            }
            return repositoryInfo.copy(str, str2, memoryCacheStats);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.featureTag;
        }

        public final MemoryCacheStats component3() {
            return this.memoryCacheStats;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RepositoryInfo) {
                    RepositoryInfo repositoryInfo = (RepositoryInfo) obj;
                    if (!C14360o3.A0K(this.name, repositoryInfo.name) || !C14360o3.A0K(this.featureTag, repositoryInfo.featureTag) || !C14360o3.A0K(this.memoryCacheStats, repositoryInfo.memoryCacheStats)) {
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ RepositoryInfo(String str, String str2, MemoryCacheStats memoryCacheStats, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : memoryCacheStats);
        }

        public final boolean hasMemoryCache() {
            return AbstractC167007dF.A1W(this.memoryCacheStats);
        }

        public int hashCode() {
            return AbstractC166997dE.A0K(this.featureTag, AbstractC166987dD.A0J(this.name)) + AbstractC167017dG.A0M(this.memoryCacheStats);
        }

        public final RepositoryInfo copy(String str, String str2, MemoryCacheStats memoryCacheStats) {
            AbstractC167017dG.A1N(str, str2);
            return new RepositoryInfo(str, str2, memoryCacheStats);
        }

        public final String getFeatureTag() {
            return this.featureTag;
        }

        public final MemoryCacheStats getMemoryCacheStats() {
            return this.memoryCacheStats;
        }

        public final String getName() {
            return this.name;
        }

        public RepositoryInfo(String str, String str2, MemoryCacheStats memoryCacheStats) {
            AbstractC167017dG.A1P(str, str2);
            this.name = str;
            this.featureTag = str2;
            this.memoryCacheStats = memoryCacheStats;
        }
    }

    public RepositoryInfoViewModel(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.session = userSession;
        C008002u A00 = C10E.A00(C16930sl.A00);
        this._repositories = A00;
        this.repositories = AbstractC208910l.A02(A00);
        AbstractC166987dD.A1Z(new AnonymousClass1(null), AbstractC141776au.A00(this));
    }

    public final C0UO getRepositories() {
        return this.repositories;
    }
}
