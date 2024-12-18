package X;

import com.instagram.clips.model.ClipsReplyBarData;

/* renamed from: X.MxV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51948MxV extends C0T6 implements InterfaceC57888Pls {
    public final ClipsReplyBarData A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C51948MxV(ClipsReplyBarData clipsReplyBarData, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = clipsReplyBarData;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51948MxV) {
                C51948MxV c51948MxV = (C51948MxV) obj;
                if (!C14360o3.A0K(this.A01, c51948MxV.A01) || !C14360o3.A0K(this.A02, c51948MxV.A02) || !C14360o3.A0K(this.A00, c51948MxV.A00) || this.A03 != c51948MxV.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))));
    }
}
