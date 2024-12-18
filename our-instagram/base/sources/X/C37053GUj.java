package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.GUj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37053GUj extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37053GUj(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37053GUj(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C31683Dvo c31683Dvo = (C31683Dvo) this.A01;
                String str = c31683Dvo.A05;
                UserSession userSession = c31683Dvo.A01;
                return new C66151U1s(c31683Dvo.A03.A00.requireActivity(), c31683Dvo.A04, userSession, str, 112, false);
            case 1:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C38144GqB) this.A01).A04, 36601054166519921L);
            case 2:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C38144GqB) this.A01).A04, 36319579190009391L);
            case 3:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C38144GqB) this.A01).A04, 36319579189878318L);
            case 4:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C38144GqB) this.A01).A04, 36601054166650994L);
            case 5:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C37934GmW) this.A01).A0D, 36315142488591414L);
            case 6:
                return new C38176Gqh((UserSession) this.A01);
            case 7:
                return new G01((UserSession) this.A01);
            case 8:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C38135Gq2) this.A01).A06, 36315881224605355L);
            case 9:
                return AbstractC166997dE.A0a();
            case 10:
                return Integer.valueOf(AbstractC25225BEi.A07(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964631714079L));
            case 11:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964631779616L);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964631845153L);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return Integer.valueOf(AbstractC25225BEi.A07(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964631910690L));
            case 14:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964631976227L);
            case Process.SIGTERM /* 15 */:
                return Integer.valueOf(AbstractC25225BEi.A07(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964632172836L));
            case 16:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C69721VuG) this.A01).A01, 36595964632238373L);
            case 17:
                C69721VuG c69721VuG = (C69721VuG) this.A01;
                return AbstractC31174DnI.A0g(C1AT.A01(c69721VuG.A01), C1AV.A1N, c69721VuG);
            case 18:
                String string = ((SVS) ((R8Y) this.A01).A0A.getValue()).A00.getString(AbstractC58317Pt9.A00(72));
                if (string == null) {
                    string = "";
                }
                return AbstractC167007dF.A0n("rawClickSource", string);
            case Process.SIGSTOP /* 19 */:
                R8Y r8y = (R8Y) this.A01;
                if (r8y.A02() != null) {
                    return AbstractC111324zv.A00(1897);
                }
                String string2 = ((SVS) r8y.A0A.getValue()).A00.getString(AbstractC58317Pt9.A00(72));
                if (string2 != null) {
                    return string2;
                }
                return "";
            case 20:
                return new C58877QEn(((BrowserLiteFragment) ((R8Y) this.A01).A01).A09);
            case 21:
                return C18U.A04(C06090Tz.A05, ((R8X) this.A01).A02, 36876451764699246L);
            case 22:
                return C18U.A04(C06090Tz.A05, ((R8X) this.A01).A02, 36876451765026927L);
            case 23:
                return C18U.A04(C06090Tz.A05, ((WbJ) this.A01).A02, 36876451764699246L);
            case 24:
                return C18U.A04(C06090Tz.A05, ((WbJ) this.A01).A02, 36876451765026927L);
            case 25:
                final UserSession userSession2 = (UserSession) this.A01;
                return new InterfaceC449925e(userSession2) { // from class: X.26R
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession2, 1);
                        this.A00 = userSession2;
                    }

                    @Override // X.InterfaceC449925e
                    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
                        return false;
                    }

                    @Override // X.InterfaceC449925e
                    public final String getContentInBackground(Context context) {
                        Boolean bool;
                        JSONObject jSONObject = new JSONObject();
                        User A01 = C17060sy.A01.A01(this.A00);
                        FanClubInfoDict B4O = A01.A03.B4O();
                        Boolean bool2 = null;
                        if (B4O == null) {
                            return null;
                        }
                        jSONObject.put("fan_club_id", B4O.getFanClubId());
                        jSONObject.put("is_fan_club_referral_eligible", B4O.CUK());
                        jSONObject.put("is_fan_club_gifting_eligible", B4O.CUI());
                        jSONObject.put("fan_consideration_page_revamp_eligiblity", B4O.B4S());
                        FanClubFanConsiderationPageFeatureEligibilityResponse B4S = B4O.B4S();
                        if (B4S != null) {
                            bool = Boolean.valueOf(B4S.getShouldShowContentPreview());
                        } else {
                            bool = null;
                        }
                        jSONObject.put("should_show_content_preview", bool);
                        FanClubFanConsiderationPageFeatureEligibilityResponse B4S2 = B4O.B4S();
                        if (B4S2 != null) {
                            bool2 = Boolean.valueOf(B4S2.getShouldShowSocialContext());
                        }
                        jSONObject.put("should_show_social_context", bool2);
                        jSONObject.put("has_exclusive_feed_content", C14360o3.A0K(A01.A03.BBd(), true));
                        jSONObject.put("has_fan_club_subscriptions", A01.A1m());
                        return jSONObject.toString();
                    }

                    @Override // X.InterfaceC449925e
                    public final String getFilenameSuffix() {
                        return RealtimeLogsProvider.LOG_SUFFIX;
                    }

                    @Override // X.InterfaceC449925e
                    public final String getTag() {
                        return "FanClubBugReportLogsProvider";
                    }

                    @Override // X.InterfaceC449925e
                    public final String getFilenamePrefix() {
                        return "fan_club_data";
                    }
                };
            case 26:
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                C0eB c0eB = C0eB.A00;
                interfaceC23621Ds.resumeWith(new C194848jk(c0eB));
                return c0eB;
            case 27:
                EL5 el5 = (EL5) this.A01;
                C66392zG A0R = AbstractC31174DnI.A0R(el5);
                FragmentActivity requireActivity = el5.requireActivity();
                A0R.A01(new C32647EYv(el5.requireContext(), requireActivity, el5, AbstractC166987dD.A0r(el5.A0O), EL5.A00(el5), AbstractC31175DnJ.A0e(el5.A0K), AbstractC31175DnJ.A0e(el5.A0M)));
                return AbstractC31173DnH.A0R(A0R, new EYP(el5.requireContext()));
            case 28:
                C3DN A00 = C3DN.A00.A00(AbstractC31172DnG.A0C(this.A01));
                if (A00 != null) {
                    return A00;
                }
                throw AbstractC166997dE.A0g();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC31172DnG.A13(AbstractC31179DnN.A04(this.A01), "creator_user_id");
            case 30:
                return AbstractC147226jy.A00(AbstractC31179DnN.A04(this.A01), "arg_is_eligible_to_subscribe");
            case 31:
                return AbstractC31172DnG.A13(AbstractC31179DnN.A04(this.A01), "origin");
            case 32:
                return AbstractC99684dl.A00(AbstractC166987dD.A0r(((EL5) this.A01).A0O));
            case 33:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "is_bottom_sheet");
            case 34:
            case 40:
            case 45:
                return this.A01;
            case 35:
            case Seq.NULL_REFNUM /* 41 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 36:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 37:
                return AbstractC147226jy.A00(AbstractC31179DnN.A04(this.A01), "arg_is_subscribed");
            case 38:
                EL5 el52 = (EL5) this.A01;
                return new C32576EWb(el52.requireActivity(), AbstractC166987dD.A0r(el52.A0O), AbstractC31175DnJ.A0e(el52.A0M), AbstractC31175DnJ.A0e(el52.A0K), AbstractC167007dF.A1Z(el52.A0P));
            case 39:
            case 44:
                return new Object[((InterfaceC19390xP[]) this.A01).length];
            case 43:
                EOL eol = (EOL) this.A01;
                return new C32578EWd(AbstractC25231BEo.A0L(eol), AbstractC166987dD.A0r(eol.A02), AbstractC25225BEi.A15(eol.A01), (ArrayList) eol.A00.getValue());
            case 48:
                EOE eoe = (EOE) this.A01;
                InterfaceC09390do interfaceC09390do = eoe.A01;
                return new EWP(AbstractC166987dD.A0r(interfaceC09390do), new SubscribedAndRecommendedCreatorListRepository(AbstractC166987dD.A0r(interfaceC09390do)), eoe.requireArguments().getBoolean("ARG_SHOW_EDUCATION_HEADER"));
            case 49:
                EIU eiu = (EIU) this.A01;
                User A02 = AbstractC31176DnK.A0h(eiu.A07).A02(AbstractC25225BEi.A15(eiu.A04));
                if (A02 != null) {
                    return A02;
                }
                throw AbstractC166997dE.A0g();
        }
    }
}
