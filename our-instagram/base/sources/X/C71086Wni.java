package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Wni, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71086Wni implements XBO {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ C66359UCf A03;
    public final /* synthetic */ C66359UCf A04;
    public final /* synthetic */ UserSession A05;

    public C71086Wni(FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState, C66359UCf c66359UCf, C66359UCf c66359UCf2, UserSession userSession) {
        this.A01 = promoteData;
        this.A05 = userSession;
        this.A04 = c66359UCf;
        this.A00 = fragmentActivity;
        this.A02 = promoteState;
        this.A03 = c66359UCf2;
    }

    @Override // X.XBO
    public final void D2u(IgRadioGroup igRadioGroup, int i) {
        XIGIGBoostDestination xIGIGBoostDestination;
        String str;
        if (i != -1) {
            PromoteData promoteData = this.A01;
            Object tag = igRadioGroup.findViewById(i).getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.api.schemas.XIGIGBoostDestination");
            if (tag == XIGIGBoostDestination.A04) {
                xIGIGBoostDestination = WGY.A00(promoteData);
            } else {
                Object tag2 = igRadioGroup.findViewById(i).getTag();
                C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.api.schemas.XIGIGBoostDestination");
                xIGIGBoostDestination = (XIGIGBoostDestination) tag2;
            }
            C70399WUb A00 = C70399WUb.A00(this.A05);
            VG4 vg4 = VG4.A17;
            switch (xIGIGBoostDestination.ordinal()) {
                case 1:
                    str = "destination_direct";
                    break;
                case 2:
                case 3:
                case 6:
                case 9:
                case 11:
                default:
                    str = "null";
                    break;
                case 4:
                    str = "destination_leadgen";
                    break;
                case 5:
                    str = "destination_ctx";
                    break;
                case 7:
                    str = "destination_engagement";
                    break;
                case 8:
                    str = "destination_profile";
                    break;
                case 10:
                    str = "destination_website";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "destination_whatsapp";
                    break;
            }
            A00.A0G(vg4, str);
            XIGIGBoostDestination xIGIGBoostDestination2 = XIGIGBoostDestination.A0E;
            if (xIGIGBoostDestination == xIGIGBoostDestination2) {
                String str2 = promoteData.A1I;
                XIGIGBoostCallToAction xIGIGBoostCallToAction = promoteData.A0b;
                if (promoteData.A2K) {
                    C66359UCf c66359UCf = this.A04;
                    FragmentActivity fragmentActivity = this.A00;
                    WGY.A01(fragmentActivity, promoteData, c66359UCf);
                    String A03 = WUZ.A00.A03(fragmentActivity, xIGIGBoostCallToAction, promoteData, c66359UCf, str2);
                    if (A03 != null) {
                        c66359UCf.setSecondaryText(A03);
                        if (xIGIGBoostCallToAction == null || str2 == null || str2.length() == 0) {
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (xIGIGBoostCallToAction != null && str2 != null && str2.length() != 0) {
                    C66359UCf c66359UCf2 = this.A04;
                    FragmentActivity fragmentActivity2 = this.A00;
                    WGY.A01(fragmentActivity2, promoteData, c66359UCf2);
                    String A04 = WUZ.A00.A04(fragmentActivity2, xIGIGBoostCallToAction, promoteData, c66359UCf2, str2);
                    if (A04 != null) {
                        c66359UCf2.setSecondaryText(A04);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    this.A04.setChecked(false);
                    this.A02.A04(null, promoteData);
                    AbstractC65702TsY.A0q();
                    V0W v0w = new V0W();
                    C140966Yy c140966Yy = new C140966Yy(this.A00, promoteData.A0y);
                    c140966Yy.A0B(null, v0w);
                    c140966Yy.A07();
                    return;
                }
            } else {
                xIGIGBoostDestination2 = XIGIGBoostDestination.A07;
                if (xIGIGBoostDestination == xIGIGBoostDestination2) {
                    if (promoteData.A16 == null || promoteData.A0d == null) {
                        this.A03.setChecked(false);
                        this.A02.A04(null, promoteData);
                        FragmentActivity fragmentActivity3 = this.A00;
                        UserSession userSession = promoteData.A0y;
                        C140966Yy c140966Yy2 = new C140966Yy(fragmentActivity3, userSession);
                        C69798Vvi A02 = AbstractC155756z4.A00().A02();
                        C14360o3.A06(userSession);
                        c140966Yy2.A0B(null, A02.A06(false));
                        c140966Yy2.A0A = VG4.A10.toString();
                        c140966Yy2.A04();
                        return;
                    }
                } else {
                    this.A02.A04(xIGIGBoostDestination, promoteData);
                    return;
                }
            }
            this.A02.A04(xIGIGBoostDestination2, promoteData);
        }
    }
}
