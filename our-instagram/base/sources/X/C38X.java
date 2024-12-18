package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;

/* renamed from: X.38X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38X implements C38Y {
    public C51622Yk A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C38Z A04;
    public final C688938a A05;
    public final C1GL A06;

    public C38X(FragmentActivity fragmentActivity, UserSession userSession, C1GL c1gl, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 4);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A06 = c1gl;
        this.A03 = interfaceC60442pS;
        this.A04 = new C38Z(fragmentActivity);
        this.A05 = new C688938a(userSession);
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.graphics.drawable.Drawable, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void A02(View view, C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU, String str) {
        String string;
        Integer num;
        Drawable drawable;
        InterfaceC199918sv yfl;
        BQL bql;
        int i;
        long j;
        Py6 py6;
        String A2u;
        Long A0k;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(c4zq, 1);
        C14360o3.A0B(interfaceC41201vU, 2);
        C14360o3.A0B(str, 3);
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C38321qM BQN = interfaceC41201vU.BQN();
        boolean Cdl = c4zq.Cdl();
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, MSV.A00(481));
        if (A00.isSampled()) {
            if (Cdl) {
                bql = BQL.A1A;
                i = 3102;
            } else {
                bql = BQL.A1B;
                i = 3106;
            }
            String A002 = AbstractC111324zv.A00(i);
            A00.AAP("containermodule", interfaceC60442pS.getModuleName());
            if (BQN != null && (A2u = BQN.A2u()) != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A00.A9K("media_id", Long.valueOf(j));
            int i2 = 0;
            A00.A8p("media_index", 0);
            A00.AAP("viewer_session_id", str);
            A00.AAP("link_format", AbstractC111324zv.A00(273));
            A00.AAP("link_type", A002);
            A00.A8R(bql, "action");
            A00.A8R(EnumC120795dP.A0k, "action_source");
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                if (i2 < length) {
                    py6 = values[i2];
                    if (C14360o3.A0K(py6.A00, C1Q2.A02().getLanguage())) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A00.A8R(py6, "translated_language");
            A00.A7v(AbstractC111324zv.A00(4788), true);
            A00.Cht();
        }
        Context context = view.getContext();
        boolean Cdl2 = c4zq.Cdl();
        C14360o3.A0A(context);
        C72782Xn2 c72782Xn2 = new C72782Xn2(context, new C57551PgP(c4zq, 47), new C57551PgP(c4zq, 48), Cdl2);
        ArrayList arrayList = new ArrayList();
        boolean z = c72782Xn2.A03;
        Context context2 = c72782Xn2.A00;
        if (z) {
            string = context2.getString(2131954806);
            C14360o3.A07(string);
            num = 0;
            drawable = context2.getDrawable(R.drawable.instagram_translate_pano_filled_24);
            yfl = new YFK(c72782Xn2);
        } else {
            string = context2.getString(2131954807);
            C14360o3.A07(string);
            num = 0;
            drawable = context2.getDrawable(R.drawable.instagram_translate_pano_filled_24);
            yfl = new YFL(c72782Xn2);
        }
        int i3 = 0;
        arrayList.add(new C199928sw(num, drawable, num, yfl, num, string, 0, 0, 0, false, false, false, true, false, false, false));
        C8QJ c8qj = new C8QJ(context, userSession, num, false);
        c8qj.A02(arrayList);
        C09530e4 A003 = c8qj.A00();
        C14360o3.A0B(context, 0);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[1];
        int intValue = ((Number) A003.A00).intValue();
        int intValue2 = ((Number) A003.A01).intValue();
        int width = (view.getWidth() / 2) - (intValue / 2);
        if (i4 > AbstractC13890nF.A00(context) / 2) {
            i3 = -(view.getHeight() + intValue2);
        }
        C09530e4 c09530e4 = new C09530e4(Integer.valueOf(width), Integer.valueOf(i3));
        c8qj.showAsDropDown(view, ((Number) c09530e4.A00).intValue(), ((Number) c09530e4.A01).intValue(), 8388611);
        if (c8qj.isShowing()) {
            c8qj.getContentView().postDelayed(new RunnableC24474Ast(c8qj), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }

    public final void A03(Fragment fragment, C38321qM c38321qM, PromptStickerModel promptStickerModel, String str) {
        C14360o3.A0B(promptStickerModel, 1);
        C14360o3.A0B(str, 3);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36330600075903916L)) {
            A01();
            return;
        }
        if (promptStickerModel.A01 != 0) {
            return;
        }
        if (C18U.A06(c06090Tz, userSession, 36314816071273281L)) {
            if (c38321qM != null) {
                AbstractC37670Gi3.A0a(this.A03, userSession, c38321qM, promptStickerModel.A03, ReelTappableObjectType.A0e.A00, str);
            } else {
                C0w9.A03("ClipsInteractiveController", "Unable to log prompt sticker button click due to null media");
            }
            AbstractC41671Ic3.A02(this.A01, fragment, C22P.A0l, userSession, c38321qM, promptStickerModel);
            return;
        }
        A00();
    }

    public final void A04(C8JW c8jw, C38321qM c38321qM, PromptStickerModel promptStickerModel, String str) {
        C14360o3.A0B(promptStickerModel, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c8jw, 3);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36330600075903916L)) {
            A01();
            return;
        }
        if (promptStickerModel.A01 != 0 || !C18U.A06(c06090Tz, userSession, 2342157825285229380L)) {
            return;
        }
        if (C18U.A06(c06090Tz, userSession, 36314816071273281L)) {
            String str2 = null;
            if (c38321qM != null) {
                AbstractC37670Gi3.A0a(this.A03, userSession, c38321qM, promptStickerModel.A03, ReelTappableObjectType.A0e.A00, str);
                str2 = c38321qM.getId();
            } else {
                C0w9.A03("ClipsInteractiveController", "Unable to log prompt sticker click due to null media");
            }
            Bundle A00 = CJ9.A00(c8jw, promptStickerModel, str2);
            FragmentActivity fragmentActivity = this.A01;
            new C6XJ(fragmentActivity, A00, userSession, ModalActivity.class, AbstractC111324zv.A00(361)).A0C(fragmentActivity);
            return;
        }
        A00();
    }

    public final void A05(C149566o8 c149566o8, InterfaceC41201vU interfaceC41201vU, C97624Zx c97624Zx, Wm1 wm1, int i) {
        C14360o3.A0B(interfaceC41201vU, 0);
        C14360o3.A0B(wm1, 1);
        C14360o3.A0B(c97624Zx, 3);
        C38321qM BQN = interfaceC41201vU.BQN();
        if (BQN != null) {
            UserSession userSession = this.A02;
            String A38 = BQN.A38();
            if (A38 != null) {
                AbstractC97594Zu.A02(userSession, wm1, A38, this.A03.getModuleName(), AbstractC86623ta.A00(BQN.A2P()), "", i);
                C41777Iet c41777Iet = new C41777Iet(c97624Zx, wm1, i);
                if (c149566o8 != null) {
                    int A00 = wm1.A00();
                    View view = c97624Zx.A01;
                    if (i == A00) {
                        if (view != null) {
                            c149566o8.A04(c41777Iet, view, false, true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (view != null) {
                        c149566o8.A03(c41777Iet, view);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                c97624Zx.A01(i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A06(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C41160IJz c41160IJz) {
        C14360o3.A0B(c41160IJz, 0);
        C14360o3.A0B(viewOnTouchListenerC97504Zk, 1);
        AbstractC140316Wj.A01(this.A02, this.A06, c41160IJz);
        viewOnTouchListenerC97504Zk.A06.post(new RunnableC71513WvI(viewOnTouchListenerC97504Zk, this.A04));
    }

    public final void A07(C101394gx c101394gx, InterfaceC97554Zq interfaceC97554Zq, String str, String str2, int i) {
        C14360o3.A0B(interfaceC97554Zq, 0);
        C14360o3.A0B(c101394gx, 1);
        if (str != null && str2 != null) {
            Context applicationContext = this.A01.getApplicationContext();
            C14360o3.A07(applicationContext);
            UserSession userSession = this.A02;
            AbstractC140306Wi.A01(applicationContext, userSession, c101394gx, null, Integer.valueOf(i), str, this.A03.getModuleName(), str2, "", -1, false);
            interfaceC97554Zq.EoG(userSession, RunnableC29599D2a.A00);
            C5SW c5sw = this.A04.A00;
            if (c5sw != null) {
                c5sw.A08(true);
            }
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        C51622Yk c51622Yk = this.A00;
        if (c51622Yk != null) {
            c51622Yk.A03 = null;
            c51622Yk.A03(true);
            this.A00 = null;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    private final void A00() {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A05();
        c146106i8.A0H = AbstractC111324zv.A00(2932);
        c146106i8.A0D = this.A01.getApplicationContext().getString(2131971023);
        c146106i8.A06();
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    private final void A01() {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A04();
        c146106i8.A0H = "prompt_button_unship_toast";
        c146106i8.A0D = this.A01.getApplicationContext().getString(2131971087);
        c146106i8.A06();
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }
}
