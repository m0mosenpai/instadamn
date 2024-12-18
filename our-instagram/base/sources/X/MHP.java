package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MHP extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHP(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new MHP(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View A0F;
        int i;
        Bundle A04;
        String str;
        switch (this.A00) {
            case 0:
            case 7:
            case 21:
            case 37:
            case 47:
                return this.A01;
            case 1:
            case 8:
            case 22:
            case 38:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 2:
            case 9:
            case 23:
            case 39:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                return ((C45803KPi) this.A01).A00.invoke();
            case 4:
                InterfaceC09390do interfaceC09390do = ((KCM) this.A01).A00;
                return new KGX(C12L.A00, AbstractC166987dD.A0r(interfaceC09390do), AbstractC46738Klv.A00(AbstractC166987dD.A0r(interfaceC09390do)), C50320MJy.A00);
            case 5:
                return AbstractC46738Klv.A00(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case 6:
                return AbstractC46738Klv.A00(AbstractC166987dD.A0r(((KB1) this.A01).A01));
            case 10:
                return ((KB2) this.A01).A03.invoke();
            case 11:
                InterfaceC09390do interfaceC09390do2 = ((KB2) this.A01).A01;
                return new KGX(C12L.A00, AbstractC166987dD.A0r(interfaceC09390do2), AbstractC46738Klv.A00(AbstractC166987dD.A0r(interfaceC09390do2)), C50320MJy.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C44525JmV c44525JmV = (C44525JmV) this.A01;
                KPC kpc = c44525JmV.A03;
                kpc.A05("OTC_DISPLAY_CODE_GET_API_TIMEOUT");
                C0K8.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", "timeout getting api");
                c44525JmV.A06.F8m(new C47316KvR(false));
                c44525JmV.A07.F8m("");
                c44525JmV.A04.F8m(new C47315KvQ(true));
                AbstractC43592JPx.A1R(kpc, "FAILURE_REASON", "GENERATE_CODE_ERROR");
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C56352iT.A0t.A03(((Fragment) this.A01).getActivity());
            case 14:
                A0F = JQ0.A0F(this.A01);
                i = R.id.bottom_button;
                return AbstractC166997dE.A0S(A0F, i);
            case Process.SIGTERM /* 15 */:
                A0F = JQ0.A0F(this.A01);
                i = R.id.enter_code_edit_text;
                return AbstractC166997dE.A0S(A0F, i);
            case 16:
                A0F = JQ0.A0F(this.A01);
                i = R.id.enter_code_description;
                return AbstractC166997dE.A0S(A0F, i);
            case 17:
            case 30:
            case 34:
                return C6CE.A00(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case 18:
                A0F = JQ0.A0F(this.A01);
                i = R.id.error_text;
                return AbstractC166997dE.A0S(A0F, i);
            case Process.SIGSTOP /* 19 */:
                return AbstractC166997dE.A0S(JQ0.A0F(this.A01), R.id.enter_code_description_loading_spinner);
            case 20:
            case 28:
            case 32:
            case 36:
            case 43:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A0F = JQ0.A0F(this.A01);
                i = R.id.cell_container;
                return AbstractC166997dE.A0S(A0F, i);
            case 24:
                return ((C45816KPv) this.A01).A00.invoke();
            case 25:
                KCM kcm = (KCM) this.A01;
                return new C45601KGp(AbstractC25231BEo.A0L(kcm), AbstractC166987dD.A0r(kcm.A00), AbstractC47844LBm.A01(kcm), LLQ.A02(kcm));
            case 26:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "BUNDLE_WAS_TABLE_DROPPED";
                return Boolean.valueOf(A04.getBoolean(str, false));
            case 27:
            case 31:
                return AbstractC47844LBm.A01((KCM) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC47843LBl.A01((UserSession) this.A01, "EncryptedBackupsOneTimeCodeEnterCodeViewModel");
            case 33:
                A0F = JQ0.A0F(this.A01);
                i = R.id.description;
                return AbstractC166997dE.A0S(A0F, i);
            case 35:
                return AbstractC166997dE.A0S(JQ0.A0F(this.A01), R.id.description_loading_spinner);
            case 40:
                return ((C45814KPt) this.A01).A02.invoke();
            case Seq.NULL_REFNUM /* 41 */:
                KCM kcm2 = (KCM) this.A01;
                return new C45593KGh(AbstractC25231BEo.A0L(kcm2), AbstractC166987dD.A0r(kcm2.A00), AbstractC47844LBm.A01(kcm2));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC47843LBl.A01((UserSession) this.A01, "EncryptedBackupsOneTimeCodeWaitViewModel");
            case 44:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "BUNDLE_HAS_IMPLICIT_BACKUP";
                return Boolean.valueOf(A04.getBoolean(str, false));
            case 45:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "BUNDLE_IS_HARDBLOCK_RELEASE";
                return Boolean.valueOf(A04.getBoolean(str, false));
        }
    }
}
