package X;

import android.content.Context;
import android.text.Editable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.LCc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47857LCc {
    public static final void A00(Context context, UserSession userSession, C159947Fg c159947Fg, ComposerAutoCompleteTextView composerAutoCompleteTextView, Object obj, boolean z) {
        AbstractC160207Gg abstractC160207Gg;
        EnumC72433Xdd enumC72433Xdd;
        AbstractC167017dG.A1S(context, userSession);
        if (obj != null) {
            if (composerAutoCompleteTextView != null && composerAutoCompleteTextView.A01) {
                CharSequence A00 = composerAutoCompleteTextView.A00(obj);
                if (obj instanceof C7CG) {
                    if (z && ((C7CG) obj).A02 == C7FZ.A03 && !AbstractC31172DnG.A1a(AbstractC166987dD.A0x(userSession), "has_seen_multi_modal_ai_nux")) {
                        AbstractC167007dF.A17(AbstractC31176DnK.A0e(userSession), "has_seen_multi_modal_ai_nux");
                        AbstractC35257Fgr.A04(context, userSession);
                    }
                    if (A00.length() > 0) {
                        composerAutoCompleteTextView.A03(A00);
                    } else {
                        composerAutoCompleteTextView.A04("");
                    }
                    ((C7CG) obj).A01.A00();
                } else if (obj instanceof C162157Nz) {
                    C162157Nz c162157Nz = (C162157Nz) obj;
                    AbstractC160207Gg abstractC160207Gg2 = c162157Nz.A01;
                    Integer A03 = abstractC160207Gg2.A03();
                    if (!c162157Nz.A08 || A03 == null || !A01(composerAutoCompleteTextView, A03.intValue())) {
                        A00(context, userSession, c159947Fg, composerAutoCompleteTextView, abstractC160207Gg2, z);
                        composerAutoCompleteTextView.getText().insert(composerAutoCompleteTextView.getSelectionStart(), String.valueOf(c162157Nz.A02.A02().A00));
                    }
                    A00(context, userSession, c159947Fg, composerAutoCompleteTextView, c162157Nz.A02, z);
                }
                if (obj instanceof C45978KWo) {
                    composerAutoCompleteTextView.A04(A00);
                } else {
                    composerAutoCompleteTextView.A03(A00);
                }
            }
            if (c159947Fg != null) {
                C159957Fh c159957Fh = c159947Fg.A05;
                if ((obj instanceof AbstractC160207Gg) && (abstractC160207Gg = (AbstractC160207Gg) obj) != null) {
                    C159967Fi c159967Fi = c159957Fh.A00;
                    String A002 = C159957Fh.A00(abstractC160207Gg);
                    String str = abstractC160207Gg.A01().A00;
                    AbstractC167017dG.A1N(A002, str);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c159967Fi.A00, "ig_direct_command_system_selected");
                    if (A0f.isSampled()) {
                        boolean A1a = AbstractC166987dD.A1a(AbstractC31172DnG.A0y(c159967Fi.A02));
                        InterfaceC83713oG interfaceC83713oG = c159967Fi.A01;
                        String A02 = AbstractC92784Dr.A02(interfaceC83713oG);
                        if (A02 == null) {
                            A02 = "";
                        }
                        Long A0j = AbstractC166997dE.A0j(A02);
                        boolean A07 = AbstractC140946Yw.A07(interfaceC83713oG);
                        if (A07) {
                            if (A1a) {
                                enumC72433Xdd = EnumC72433Xdd.A03;
                            } else {
                                enumC72433Xdd = EnumC72433Xdd.A04;
                            }
                        } else if (A1a) {
                            enumC72433Xdd = EnumC72433Xdd.A05;
                        } else {
                            enumC72433Xdd = EnumC72433Xdd.A06;
                        }
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A02);
                        c0Zx.A06("key", A02);
                        c0Zx.A01(enumC72433Xdd, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        A0f.AAQ(c0Zx, "thread");
                        A0f.A9K("recipient_id", A0j);
                        A0f.AAP(AbstractC111324zv.A00(4145), str);
                        AbstractC31171DnF.A1G(A0f, A002);
                        AbstractC31175DnJ.A1A(A0f, A07);
                        A0f.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
                        AbstractC31171DnF.A1H(A0f, AbstractC92784Dr.A02(interfaceC83713oG));
                        A0f.Cht();
                    }
                }
            } else {
                return;
            }
        } else if (c159947Fg == null) {
            return;
        }
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c159947Fg.A03.A00, "msg_mention_clicks");
        if (A0f2.isSampled()) {
            A0f2.A7v("is_xac_thread", AbstractC166997dE.A0a());
            A0f2.A7v(MSV.A00(102), AbstractC166997dE.A0b());
            A0f2.Cht();
        }
    }

    public static final boolean A01(ComposerAutoCompleteTextView composerAutoCompleteTextView, int i) {
        if (composerAutoCompleteTextView == null) {
            return false;
        }
        Editable text = composerAutoCompleteTextView.getText();
        C0s6 A00 = AbstractC13190m5.A00(text.getSpans(0, text.length(), A7L.class));
        while (A00.hasNext()) {
            Integer A03 = ((A7L) A00.next()).A00.A03();
            if (A03 != null && A03.intValue() == i) {
                return true;
            }
        }
        return false;
    }
}
