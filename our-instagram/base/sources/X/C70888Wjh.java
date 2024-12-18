package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wjh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70888Wjh implements XLN {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C18920wW A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Hashtag A04;

    @Override // X.InterfaceC71952XCe
    public final void DjY(C38657Gyy c38657Gyy) {
    }

    @Override // X.InterfaceC71952XCe
    public final boolean Ejj(C38657Gyy c38657Gyy) {
        return false;
    }

    public C70888Wjh(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, Hashtag hashtag) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = c18920wW;
        this.A04 = hashtag;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.XLN
    public final void DM0(C38657Gyy c38657Gyy) {
        String str = c38657Gyy.A02;
        if (str != null && !str.isEmpty()) {
            String str2 = c38657Gyy.A05;
            if (str2 != null || c38657Gyy.A06 != null) {
                C25531Mh A0G = C25531Mh.A0G(this.A02);
                if (((AbstractC02600Aj) A0G).A00.isSampled()) {
                    AbstractC65702TsY.A1G(A0G, c38657Gyy, str2);
                    Hashtag hashtag = this.A04;
                    if (hashtag.getId() != null) {
                        A0G.A0Q("hashtag_id", AbstractC25228BEl.A13(hashtag.getId()));
                        A0G.A0R("hashtag_name", hashtag.getName());
                    }
                    A0G.Cht();
                }
            }
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            if (!AbstractC41776Ies.A0C(fragmentActivity, userSession, str, interfaceC11380iw.getModuleName())) {
                AbstractC35275FhA.A04(fragmentActivity, userSession, C2Fb.A1x, str, interfaceC11380iw.getModuleName());
                return;
            }
            return;
        }
        new C140966Yy(this.A00, this.A03).A06();
    }
}
