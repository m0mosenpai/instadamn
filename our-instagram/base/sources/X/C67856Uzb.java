package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uzb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67856Uzb extends AnonymousClass935 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67856Uzb(UserSession userSession, Object obj, Object obj2, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(252460527);
                C0SG c0sg = (C0SG) ((WDF) this.A01).A0B.A0Q(ReactProgressBarViewManager.PROP_PROGRESS);
                if (c0sg != null) {
                    c0sg.A08();
                }
                i = -1070546211;
                break;
            case 3:
                A03 = C0f9.A03(1786894720);
                C0SG c0sg2 = (C0SG) ((WDF) this.A01).A0B.A0Q(ReactProgressBarViewManager.PROP_PROGRESS);
                if (c0sg2 != null) {
                    c0sg2.A08();
                }
                i = -1243560268;
                break;
            default:
                super.A01(userSession);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(1545171903);
                i = 1430010041;
                break;
            case 3:
                A03 = C0f9.A03(-561164825);
                i = -522176179;
                break;
            default:
                super.A02(userSession);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A0G;
        int i;
        switch (this.A00) {
            case 0:
                A0G = AbstractC25231BEo.A0G(abstractC115105If, -914766836);
                ((InterfaceC16660sJ) this.A02).invoke(abstractC115105If);
                i = -1856167874;
                break;
            case 1:
                A0G = AbstractC25231BEo.A0G(abstractC115105If, -1230661690);
                ((InterfaceC16660sJ) this.A02).invoke(abstractC115105If);
                i = -63501049;
                break;
            case 2:
                A0G = C0f9.A03(1528598649);
                WDF wdf = (WDF) this.A01;
                if (wdf.A07 == 29) {
                    C142846ck A00 = AbstractC147806l5.A00(wdf.A0D);
                    int i2 = wdf.A06;
                    String str = wdf.A0G;
                    String str2 = wdf.A0H;
                    C25531Mh A0E = C25531Mh.A0E(A00.A03);
                    if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                        AbstractC31175DnJ.A1B(A0E, A00);
                        AbstractC31174DnI.A1I(A0E, "thread_update_photo_error");
                        A0E.A0o("change_photo");
                        AbstractC31177DnL.A1H(A0E, A00, AbstractC31179DnN.A0a(A0E, "change_photo_dialog", str, str2, i2));
                    }
                }
                WDF.A00(wdf);
                i = -665301601;
                break;
            default:
                A0G = C0f9.A03(810874785);
                WDF.A00((WDF) this.A01);
                i = -1181173119;
                break;
        }
        C0f9.A0A(i, A0G);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-637534411);
                int A0G = AbstractC25231BEo.A0G(obj, 1959986023);
                ((InterfaceC16660sJ) this.A01).invoke(obj);
                C0f9.A0A(-1351781709, A0G);
                i = -1834695865;
                break;
            case 1:
                A03 = C0f9.A03(1986613748);
                int A0G2 = AbstractC25231BEo.A0G(obj, -1318850958);
                ((InterfaceC16660sJ) this.A01).invoke(obj);
                C0f9.A0A(-182524794, A0G2);
                i = -1842365749;
                break;
            case 2:
                A03 = C0f9.A03(1104028954);
                int A032 = C0f9.A03(-1991701321);
                C43707JUs c43707JUs = ((C1574875f) obj).A02;
                if (c43707JUs != null) {
                    AbstractC28761aE.A00(userSession).FBb(c43707JUs);
                }
                WDF wdf = (WDF) this.A01;
                if (wdf.A07 == 29) {
                    C142846ck A00 = AbstractC147806l5.A00(wdf.A0D);
                    int i2 = wdf.A06;
                    String str = wdf.A0G;
                    String str2 = wdf.A0H;
                    C25531Mh A0E = C25531Mh.A0E(A00.A03);
                    if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                        AbstractC31175DnJ.A1B(A0E, A00);
                        AbstractC31174DnI.A1I(A0E, "thread_update_photo_success");
                        A0E.A0o("change_photo");
                        AbstractC31177DnL.A1H(A0E, A00, AbstractC31179DnN.A0a(A0E, "change_photo_dialog", str, str2, i2));
                    }
                }
                ((XAZ) this.A02).FCz();
                C0f9.A0A(-134232653, A032);
                i = -157360595;
                break;
            default:
                A03 = C0f9.A03(1777582824);
                int A033 = C0f9.A03(1930575376);
                C43707JUs c43707JUs2 = ((C1574875f) obj).A02;
                if (c43707JUs2 != null) {
                    AbstractC28761aE.A00(userSession).FBb(c43707JUs2);
                }
                ((XAZ) this.A02).FCz();
                C0f9.A0A(-2013053075, A033);
                i = -734004962;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
