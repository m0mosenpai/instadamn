package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* renamed from: X.Gdu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37414Gdu implements C11R {
    public C6VU A00;
    public final int A01;
    public final Context A02;
    public final InterfaceC140726Ya A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C6PT A07;
    public final UserSession A08;
    public final C139366Sr A09;
    public final EnumC140736Yb A0A;

    public final C6VU A00(String str) {
        C14360o3.A0B(str, 0);
        C6VU c6vu = this.A00;
        if (c6vu == null) {
            C6VS c6vs = C6VR.A01;
            UserSession userSession = this.A08;
            c6vu = c6vs.A01(C6VS.A00(userSession, str), userSession, str);
            this.A00 = c6vu;
        }
        if (c6vu != null) {
            return c6vu;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C11R
    public final String getName() {
        return "ShowreelNativeAssetPrefetchTask";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 584;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public C37414Gdu(Context context, UserSession userSession, C139366Sr c139366Sr, IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf, InterfaceC140726Ya interfaceC140726Ya, EnumC140736Yb enumC140736Yb, int i, int i2, int i3, int i4) {
        AbstractC25229BEm.A1J(c139366Sr, 8, enumC140736Yb);
        this.A08 = userSession;
        this.A02 = context;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A01 = i4;
        this.A09 = c139366Sr;
        this.A03 = interfaceC140726Ya;
        this.A0A = enumC140736Yb;
        this.A07 = AbstractC37415Gdv.A00(igShowreelNativeAnimationIntf);
    }

    @Override // X.C11R
    public final void run() {
        EnumC140736Yb enumC140736Yb = this.A0A;
        String str = enumC140736Yb.A00;
        try {
            C6PT c6pt = this.A07;
            C37416Gdw c37416Gdw = (C37416Gdw) c6pt;
            String str2 = c37416Gdw.A03;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = enumC140736Yb.A01;
            String str4 = c37416Gdw.A05;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c37416Gdw.A04;
            if (str5 == null) {
                str5 = "";
            }
            boolean A1V = AbstractC167007dF.A1V(str3);
            String EqO = this.A09.EqO();
            ImmutableList Acw = c6pt.Acw();
            ImmutableList Acy = c6pt.Acy();
            C65750TtP A00 = AbstractC65749TtO.A00(Integer.valueOf(this.A04), null, Integer.valueOf(this.A05), Integer.valueOf(this.A06), c37416Gdw.A02, str2, str5, EqO, null, str3, str4, Acw, Acy);
            C6VU A002 = A00(str);
            A002.A04(new C37417Gdx(this, str), A00, A002.A02(A00, A1V));
        } catch (C902840n e) {
            this.A03.DEd();
            C0K8.A0G("ShowreelNativeAssetPrefetchTask", "Failed to prefetch media", e);
        }
    }
}
