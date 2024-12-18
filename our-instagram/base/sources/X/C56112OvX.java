package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OvX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56112OvX implements InterfaceC66482zP {
    public final UserSession A00;
    public final CharSequence A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_monetization";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56112OvX c56112OvX = (C56112OvX) obj;
        C14360o3.A0B(c56112OvX, 0);
        if (C14360o3.A0K(this.A02, c56112OvX.A02)) {
            if (AbstractC31174DnI.A1a(c56112OvX.A01, this.A01.toString()) && this.A03 == c56112OvX.A03 && this.A04 == c56112OvX.A04) {
                return true;
            }
        }
        return false;
    }

    public C56112OvX(UserSession userSession, CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = str;
        this.A01 = charSequence;
        this.A03 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A00 = userSession;
    }
}
