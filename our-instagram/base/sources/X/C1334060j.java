package X;

import kotlin.Deprecated;

@Deprecated(message = "This should only be used for legacy results that likely should be migrated to [Dropped.Failure].")
/* renamed from: X.60j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334060j extends C60f {
    public final Exception A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1334060j) {
                C1334060j c1334060j = (C1334060j) obj;
                if (!C14360o3.A0K(this.A01, c1334060j.A01) || !C14360o3.A0K(this.A02, c1334060j.A02) || !C14360o3.A0K(this.A00, c1334060j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public C1334060j(Exception exc, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = exc;
    }
}
