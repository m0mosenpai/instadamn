package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.GUm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37056GUm extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37056GUm(EOK eok, int i) {
        super(0);
        this.A00 = i;
        this.A01 = eok;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Resources resources;
        String str;
        switch (this.A00) {
            case 1:
                C26780Bs3 c26780Bs3 = (C26780Bs3) this.A01;
                return new KG1(c26780Bs3, AbstractC166987dD.A0r(c26780Bs3.A00));
            case 2:
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 28:
            case 35:
                return this.A01;
            case 3:
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 36:
                return AbstractC25226BEj.A1C(this.A01);
            case 4:
            case 9:
            case 14:
            case 30:
            case 37:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 5:
                return new C32563EVn(AbstractC31179DnN.A04(this.A01));
            case 6:
                return AbstractC34062F1p.A00(AbstractC166987dD.A0r(((C32246EIf) this.A01).A0A));
            case 10:
                C32246EIf c32246EIf = (C32246EIf) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c32246EIf.A0A);
                String str2 = c32246EIf.A06;
                if (str2 == null) {
                    str = "itemId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                DirectThreadKey directThreadKey = c32246EIf.A05;
                if (directThreadKey != null) {
                    return new EWO(A0r, directThreadKey, str2);
                }
                str = "threadKey";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 11:
                return Boolean.valueOf(((C31831Dyp) ((EOK) this.A01).A0K.getValue()).A01(true, true));
            case Process.SIGTERM /* 15 */:
                return C98Q.A00(AbstractC166987dD.A0r(((EOK) this.A01).A0I));
            case 16:
                EOK eok = (EOK) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(eok.A0I);
                DirectThreadKey directThreadKey2 = eok.A08;
                if (directThreadKey2 != null) {
                    String str3 = eok.A0B;
                    if (str3 == null) {
                        str = "messageId";
                    } else {
                        String str4 = eok.A0A;
                        if (str4 == null) {
                            str = "collectionId";
                        } else {
                            int i = eok.A00;
                            String str5 = eok.A0D;
                            if (str5 == null) {
                                str = "userType";
                            } else {
                                return new C32581EWg(eok, A0r2, directThreadKey2, str3, str4, str5, i);
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "threadKey";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 17:
                ((FRJ) this.A01).A08.getView().setVisibility(8);
                return C0eB.A00;
            case 18:
                return new DirectDailyPromptsResponseListRepository((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                C31831Dyp c31831Dyp = (C31831Dyp) ((EOK) this.A01).A0K.getValue();
                c31831Dyp.A07.Egh(new E9G("Prompt title", String.valueOf(c31831Dyp.A03.A06.getValue())));
                return C0eB.A00;
            case 20:
                EOK eok2 = (EOK) this.A01;
                C193328hC A0b = AbstractC31176DnK.A0b(eok2);
                A0b.A0A(2131959002);
                A0b.A09(2131959001);
                A0b.A0M(DialogInterfaceOnClickListenerC35453FkA.A00(eok2, 0), 2131960774);
                DialogInterfaceOnClickListenerC35453FkA.A01(A0b, eok2, 1);
                AbstractC31178DnM.A1R(A0b, true);
                C36297Fzr c36297Fzr = eok2.A02;
                if (c36297Fzr == null) {
                    str = "dailyPromptsLogger";
                } else {
                    String str6 = eok2.A0C;
                    if (str6 == null) {
                        str = "threadId";
                    } else {
                        DirectThreadKey directThreadKey3 = eok2.A08;
                        if (directThreadKey3 != null) {
                            C36297Fzr.A01(c36297Fzr, str6, directThreadKey3.A01, "delete_daily_prompt_dialog_rendered", "tap", "delete_daily_prompt_button", "daily_prompt_responses_sheet", eok2.A00);
                            return C0eB.A00;
                        }
                        str = "threadKey";
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 21:
                return AbstractC165967bO.A00(((C31816Dya) this.A01).A00);
            case 22:
            case 23:
                return new Object[((InterfaceC19390xP[]) this.A01).length];
            case 24:
                return Boolean.valueOf(AbstractC167007dF.A1M(((C47988LJq) this.A01).A0K.hasAmplitudeControl() ? 1 : 0));
            case 25:
                return new C51109MiE(((C47974LIk) this.A01).A07, 2);
            case 26:
                Context A06 = AbstractC31172DnG.A06(this.A01);
                if (A06 != null && (resources = A06.getResources()) != null) {
                    return Integer.valueOf(resources.getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height));
                }
                return null;
            case 27:
                return new C32564EVo(AbstractC166987dD.A0r(((KDS) this.A01).A05));
            case 31:
                ((LQ2) this.A01).A02.performClick();
                return C0eB.A00;
            case 32:
                return AbstractC147806l5.A00(((C34507FIt) this.A01).A00);
            case 33:
                return new KZ7((UserSession) this.A01);
            case 34:
                KWN kwn = (KWN) this.A01;
                return new KGP(AbstractC166987dD.A0r(kwn.A0A), ((KDO) kwn).A06, kwn.A00);
            case 38:
                return new C47990LJt((UserSession) this.A01);
            case 39:
                return new C47934LFh((UserSession) this.A01);
            case 40:
                return new C9A3((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new C9A2((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C47620L1f((UserSession) this.A01);
            case 43:
                return new C48518LdG((UserSession) this.A01);
            case 44:
                return new C47778L8d((UserSession) this.A01);
            case 45:
                return new C47580Kzq((UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C4M0((UserSession) this.A01);
            case 47:
                return new C6JV((UserSession) this.A01);
            case 48:
                C34634FNr c34634FNr = (C34634FNr) this.A01;
                return new FIG(AbstractC121115e3.A00(c34634FNr.A01), new FGN(c34634FNr));
            case 49:
                return C31651DvH.A00(((C34634FNr) this.A01).A01, G03.class, 12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37056GUm(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }
}
