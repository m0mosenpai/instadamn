package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.EoB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC33316EoB {
    public static final Map A01;
    public final String A00;

    static {
        C32982Efo c32982Efo = new C32982Efo(4);
        C32982Efo c32982Efo2 = new C32982Efo(5);
        C32982Efo c32982Efo3 = new C32982Efo(6);
        C32982Efo c32982Efo4 = new C32982Efo(7);
        C32982Efo c32982Efo5 = new C32982Efo(8);
        C32982Efo c32982Efo6 = new C32982Efo(9);
        C32982Efo c32982Efo7 = new C32982Efo(10);
        C32982Efo c32982Efo8 = new C32982Efo(11);
        C32982Efo c32982Efo9 = new C32982Efo(12);
        C32982Efo c32982Efo10 = new C32982Efo(0);
        C32982Efo c32982Efo11 = new C32982Efo(1);
        C32982Efo c32982Efo12 = new C32982Efo(2);
        C32982Efo c32982Efo13 = new C32982Efo(3);
        EnumMap enumMap = new EnumMap(EnumC33368Ep1.class);
        A01 = enumMap;
        enumMap.put((EnumMap) EnumC33368Ep1.SEND_PASSWORD_RESET_EMAIL, (EnumC33368Ep1) c32982Efo);
        enumMap.put((EnumMap) EnumC33368Ep1.SEND_PASSWORD_RESET_SMS, (EnumC33368Ep1) c32982Efo2);
        enumMap.put((EnumMap) EnumC33368Ep1.LOGIN_WITH_FACEBOOK, (EnumC33368Ep1) c32982Efo3);
        enumMap.put((EnumMap) EnumC33368Ep1.FORGOT_PASSWORD_FLOW, (EnumC33368Ep1) c32982Efo4);
        enumMap.put((EnumMap) EnumC33368Ep1.SEND_ONE_CLICK_LOGIN_EMAIL, (EnumC33368Ep1) c32982Efo5);
        enumMap.put((EnumMap) EnumC33368Ep1.SWITCH_TO_SIGNUP_FLOW, (EnumC33368Ep1) c32982Efo6);
        enumMap.put((EnumMap) EnumC33368Ep1.STOP_ACCOUNT_DELETION, (EnumC33368Ep1) c32982Efo7);
        enumMap.put((EnumMap) EnumC33368Ep1.GO_TO_HELPER_URL, (EnumC33368Ep1) c32982Efo8);
        enumMap.put((EnumMap) EnumC33368Ep1.SHOW_RECOVERY_CHALLENGE, (EnumC33368Ep1) c32982Efo9);
        enumMap.put((EnumMap) EnumC33368Ep1.LEARN_MORE, (EnumC33368Ep1) c32982Efo10);
        enumMap.put((EnumMap) EnumC33368Ep1.BACK_TO_LOGIN, (EnumC33368Ep1) c32982Efo12);
        enumMap.put((EnumMap) EnumC33368Ep1.DISMISS, (EnumC33368Ep1) c32982Efo11);
        enumMap.put((EnumMap) EnumC33368Ep1.DEFAULT, (EnumC33368Ep1) c32982Efo13);
    }

    public final void A00(C07270a1 c07270a1) {
        InterfaceC02590Ai A0f;
        String str = this.A00;
        if (str.equals("retry")) {
            double A012 = AbstractC31171DnF.A01();
            double A00 = AbstractC31171DnF.A00();
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "retry_tapped");
            AbstractC31175DnJ.A0y(A0f);
            AbstractC31177DnL.A1B(A0f, A012, A00);
            AbstractC31171DnF.A1A(A0f, "access_dialog");
            AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A00);
            AbstractC31176DnK.A1K(A0f, A012);
            AbstractC35274Fh9.A09(A0f, c07270a1);
        } else {
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "recovery_tapped");
            if (!A0f.isSampled()) {
                return;
            }
            AbstractC31178DnM.A15(A0f, System.currentTimeMillis(), C1Q9.A00());
            AbstractC31175DnJ.A0y(A0f);
            AbstractC31171DnF.A1A(A0f, "access_dialog");
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            AbstractC31172DnG.A1N(A0f);
            AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
            AbstractC35274Fh9.A09(A0f, c07270a1);
        }
        A0f.Cht();
    }

    public EnumC33316EoB(String str, int i, String str2) {
        this.A00 = str2;
    }
}
