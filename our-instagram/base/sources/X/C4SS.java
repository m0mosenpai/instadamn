package X;

import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import java.util.List;

/* renamed from: X.4SS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SS {
    public int A00;
    public int A01;
    public int A02;
    public C2BB A03;
    public EnumC46372Az A04;
    public Integer A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final AudioFocusLossSettings A0I;
    public final C4AO A0J;
    public final C4AN A0K;
    public final InterfaceC96424Va A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public final boolean equals(Object obj) {
        C4AN c4an = this.A0K;
        if (c4an.A0G == null || !(obj instanceof C4SS)) {
            return false;
        }
        C4SS c4ss = (C4SS) obj;
        if (!c4an.equals(c4ss.A0K) || this.A0F != c4ss.A0F || this.A0E != c4ss.A0E) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A0K.hashCode() * 31) + this.A0F) * 31) - 1) * 31) + this.A0E;
    }

    public C4SS(AudioFocusLossSettings audioFocusLossSettings, EnumC46372Az enumC46372Az, C4AO c4ao, C4AN c4an, InterfaceC96424Va interfaceC96424Va, Integer num, String str, String str2, List list, List list2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.A0K = c4an;
        this.A06 = str;
        this.A04 = enumC46372Az;
        this.A00 = i;
        this.A0C = z;
        this.A0D = z2;
        this.A05 = num;
        this.A01 = i2;
        this.A0F = i3;
        this.A0E = i4;
        this.A02 = i5;
        this.A0J = c4ao;
        this.A0H = i6;
        this.A0G = i7;
        this.A0T = z3;
        this.A0R = z4;
        this.A07 = str2;
        this.A0A = z5;
        this.A0I = audioFocusLossSettings;
        this.A0V = z6;
        this.A0W = z7;
        this.A0U = z8;
        this.A0Q = z9;
        this.A0S = z10;
        this.A0O = z11;
        this.A0N = list;
        this.A0M = list2;
        this.A0L = interfaceC96424Va;
        this.A0B = z12;
        this.A09 = z13;
        this.A08 = z14;
        this.A0P = z15;
    }
}
