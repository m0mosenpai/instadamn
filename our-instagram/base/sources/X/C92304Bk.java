package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92304Bk {
    public EnumC46372Az A00;
    public boolean A01;
    public final C4AM A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C92304Bk c92304Bk = (C92304Bk) obj;
            if (!C2I7.A00(this.A07, c92304Bk.A07) || !C2I7.A00(this.A03, c92304Bk.A03) || !C2I7.A00(this.A04, c92304Bk.A04) || !C2I7.A00(this.A08, c92304Bk.A08) || this.A02 != c92304Bk.A02 || this.A00 != c92304Bk.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A03, this.A04, this.A08, this.A00, this.A02, false, Boolean.valueOf(this.A01)});
    }

    public C92304Bk(EnumC46372Az enumC46372Az, C4AM c4am, String str, String str2, String str3, boolean z) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = null;
        this.A00 = enumC46372Az;
        this.A02 = c4am;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = false;
        this.A0A = false;
    }

    public C92304Bk(EnumC46372Az enumC46372Az, String str, boolean z) {
        C4AM c4am = C4AM.GENERAL;
        this.A07 = str;
        this.A03 = null;
        this.A04 = null;
        this.A08 = null;
        this.A00 = enumC46372Az;
        this.A02 = c4am;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = false;
        this.A0A = false;
    }

    public C92304Bk(EnumC46372Az enumC46372Az, C4AM c4am, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = enumC46372Az;
        this.A02 = c4am;
        this.A01 = z;
        this.A06 = "";
        this.A05 = "";
        this.A09 = false;
        this.A0A = z2;
    }

    public C92304Bk(EnumC46372Az enumC46372Az, C4AM c4am, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = enumC46372Az;
        this.A02 = c4am;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = z2;
        this.A0A = false;
    }

    public C92304Bk(EnumC46372Az enumC46372Az, C4AM c4am, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = enumC46372Az;
        this.A02 = c4am;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = false;
        this.A0A = false;
    }
}
