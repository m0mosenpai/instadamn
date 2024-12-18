package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.activity.ComponentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Pbg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57258Pbg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57258Pbg(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableList coerceList;
        switch (this.A00) {
            case 0:
                SharedPreferences sharedPreferences = ((Context) this.A01).getSharedPreferences(this.A02, 0);
                C14360o3.A07(sharedPreferences);
                return sharedPreferences;
            case 1:
                return new OJB((ComponentActivity) this.A01, this.A02);
            case 2:
                C0K8.A0C("MultiInstanceManager", AnonymousClass001.A0R("Failed to login background account ", this.A02));
                JZK.A00((JZK) this.A01);
                break;
            case 3:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((TreeJNI) this.A01).getOptionalBooleanList(this.A02);
            case 4:
            case 14:
                return ((TreeJNI) this.A01).getOptionalDoubleList(this.A02);
            case 5:
            case 7:
                C2JS c2js = (C2JS) this.A01;
                coerceList = c2js.coerceList(c2js.getOptionalStringList(this.A02));
                return coerceList;
            case 6:
            case Process.SIGTERM /* 15 */:
                return ((TreeJNI) this.A01).getOptionalIntList(this.A02);
            case 8:
            case 16:
                return ((TreeJNI) this.A01).getOptionalStringList(this.A02);
            case 9:
            case 17:
                return ((TreeJNI) this.A01).getOptionalTimeList(this.A02);
            case 10:
            case 11:
            case 20:
            default:
                return ((TreeJNI) this.A01).getStringValue(this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((TreeJNI) this.A01).getOptionalBooleanValue(this.A02);
            case 18:
                return ((TreeJNI) this.A01).getOptionalDoubleValue(this.A02);
            case Process.SIGSTOP /* 19 */:
                return ((TreeJNI) this.A01).getOptionalIntValue(this.A02);
            case 21:
                return ((TreeJNI) this.A01).getOptionalTimeValue(this.A02);
            case 22:
                return ((TreeJNI) this.A01).getBooleanList(this.A02);
            case 23:
                return ((TreeJNI) this.A01).getDoubleList(this.A02);
            case 24:
                return ((TreeJNI) this.A01).getIntList(this.A02);
            case 25:
                return ((TreeJNI) this.A01).getStringList(this.A02);
            case 26:
                return ((TreeJNI) this.A01).getTimeList(this.A02);
            case 27:
                String stringValue = ((TreeJNI) this.A01).getStringValue(this.A02);
                AbstractC25225BEi.A1S(stringValue);
                return stringValue;
            case 28:
                String str = this.A02;
                String A0h = AbstractC31171DnF.A0h(str, OVR.A01);
                if (A0h != null) {
                    str = A0h;
                }
                AbstractC53642Nnn abstractC53642Nnn = (AbstractC53642Nnn) OVR.A02.remove(str);
                if (abstractC53642Nnn != null) {
                    int A0H = AbstractC166987dD.A0H(this.A01);
                    if (A0H != 0) {
                        if (A0H != 1) {
                            if (A0H != 2) {
                                if (A0H == 3) {
                                    abstractC53642Nnn.A01();
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                abstractC53642Nnn.A03();
                            }
                        } else {
                            abstractC53642Nnn.A02();
                        }
                    } else {
                        abstractC53642Nnn.A00();
                    }
                }
                C01U c01u = OVR.A03;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : c01u) {
                    if (AbstractC002300n.A0h((String) obj, AnonymousClass001.A0C(str, '$'), false)) {
                        A1E.add(obj);
                    }
                }
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    Activity A00 = OVM.A00.A00(A1B);
                    if (A00 != null) {
                        A00.finish();
                    }
                    c01u.remove(A1B);
                }
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String str2 = this.A02;
                C0K8.A0P("proxy_service", "onClientAddress %s", str2);
                AbstractC55594OmX abstractC55594OmX = (AbstractC55594OmX) this.A01;
                C14360o3.A0B(str2, 0);
                abstractC55594OmX.A02 = AbstractC25227BEk.A0w(str2, 0, AbstractC001900j.A05(str2, ':', str2.length() - 1));
                break;
            case 30:
                String str3 = this.A02;
                C0K8.A0P("proxy_service", "onClientRegion %s", str3);
                ((AbstractC55594OmX) this.A01).A03 = str3;
                break;
            case 31:
                Wap A0H2 = AbstractC43592JPx.A0H();
                UFU ufu = (UFU) this.A01;
                LoggingContext loggingContext = ufu.A0R;
                String str4 = this.A02;
                C70073W1q A05 = ufu.A0S.A05();
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                C70199WGm.A08(A05, A1I);
                A0H2.A0c(loggingContext, str4, A1I);
                break;
            case 32:
                return new C62552su(this.A02, (long) C18U.A00(C06090Tz.A05, (AbstractC12990ll) this.A01, 37163394235040030L));
            case 33:
            case 34:
                ((WEN) this.A01).A00.DKz(this.A02);
                break;
            case 35:
            case 39:
                ((InterfaceC16660sJ) this.A01).invoke(this.A02);
                break;
            case 36:
                ((C27271C1v) this.A01).A08(this.A02);
                break;
            case 37:
                ((InterfaceC16620sF) this.A01).invoke("example_dialogue", this.A02);
                break;
            case 38:
                C26795BsJ c26795BsJ = (C26795BsJ) this.A01;
                String A0R = AnonymousClass001.A0R(C18U.A04(C06090Tz.A05, AbstractC31178DnM.A0M(c26795BsJ.A01), 36886961551966964L), this.A02);
                C28484Chc c28484Chc = (C28484Chc) c26795BsJ.A00.getValue();
                String str5 = (String) ((C25878Bcd) c26795BsJ.A02.getValue()).A0J.getValue();
                C25531Mh A002 = C28484Chc.A00(c28484Chc);
                if (AbstractC25226BEj.A1Z(A002)) {
                    A002.A0k("settings_knowledge_get_link_button_clicked");
                    A002.A0i(AbstractC25233BEq.A0n(str5));
                    A002.Cht();
                }
                Intent A04 = AbstractC31171DnF.A04();
                A04.setAction("android.intent.action.SEND");
                A04.putExtra("android.intent.extra.TEXT", A0R);
                A04.setType("text/plain");
                C12260kU.A0E(c26795BsJ.requireContext(), Intent.createChooser(A04, null));
                break;
            case 40:
                C7W9 c7w9 = (C7W9) this.A01;
                c7w9.A02.markPointWithEditor(c7w9.A00, "message_sent").addPointData("message_type", this.A02).pointEditingCompleted();
                break;
            case Seq.NULL_REFNUM /* 41 */:
                UserSession userSession = (UserSession) this.A01;
                String str6 = this.A02;
                if (str6 == null) {
                    str6 = AbstractC58442PvL.A02();
                }
                return new C56128Ovo(userSession, str6);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                String str7 = this.A02;
                if (str7 != null) {
                    AbstractC25225BEi.A1U(this.A01, str7);
                    break;
                }
                break;
            case 43:
                ((C73453YDw) this.A01).DlT(this.A02, null, null);
                break;
            case 44:
                ((C73453YDw) this.A01).DlX(this.A02, null, null);
                break;
            case 45:
                ((C5yI) this.A01).DQJ(this.A02);
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 48:
                ((C5yI) this.A01).DF6(this.A02);
                break;
            case 47:
                ((InterfaceC132365yF) this.A01).CrS(this.A02);
                break;
            case 49:
                ((C5yI) this.A01).DhI(this.A02);
                break;
        }
        return C0eB.A00;
    }
}
