package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1eM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31171eM implements InterfaceC29301b7 {
    public static final C0KV A02 = C31181eN.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31151eK c31151eK = (C31151eK) c1ow;
        C14360o3.A0B(c31151eK, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c31151eK.C7R();
        C14360o3.A07(C7R);
        JTa jTa = ((C1OW) c31151eK).A02;
        C26069Bfx c26069Bfx = c31151eK.A00;
        if (c26069Bfx != null) {
            if (C7R.size() == 1) {
                UserSession userSession = this.A00;
                DirectThreadKey directThreadKey = (DirectThreadKey) c31151eK.C7R().get(0);
                String A06 = c31151eK.A06();
                String str = c31151eK.A05;
                boolean z = jTa.A09;
                String str2 = jTa.A04;
                L1W l1w = jTa.A00;
                String str3 = c26069Bfx.A03;
                String str4 = c26069Bfx.A02;
                String str5 = c26069Bfx.A00;
                String str6 = c26069Bfx.A01;
                String str7 = c31151eK.A01;
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A05();
                c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
                c25621Ms.A9s("text", str3);
                c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
                c25621Ms.A0S(C40781ul.class, C55702hA.class);
                AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str2, z, false, false);
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str4)) {
                    AbstractC47211Ktk abstractC47211Ktk = null;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Object obj = EnumC75383a5.A01.get(str6);
                        if (obj == null) {
                            obj = EnumC75383a5.A1J;
                        }
                        if (obj == EnumC75383a5.A14 && str7 != null) {
                            QuestionResponseType A00 = AbstractC201648vt.A00(str7);
                            if (A00 == QuestionResponseType.A06) {
                                abstractC47211Ktk = AbstractC47211Ktk.A0T;
                            } else if (A00 == QuestionResponseType.A05) {
                                abstractC47211Ktk = AbstractC47211Ktk.A0H;
                                jSONObject.put("response_igid", str5);
                            } else {
                                abstractC47211Ktk = AbstractC47211Ktk.A0U;
                            }
                            jSONObject.put("fbid", str5);
                        } else {
                            if (obj == EnumC75383a5.A0x) {
                                abstractC47211Ktk = AbstractC47211Ktk.A0S;
                            } else if (obj == EnumC75383a5.A16) {
                                abstractC47211Ktk = AbstractC47211Ktk.A0V;
                            } else if (obj == EnumC75383a5.A1C) {
                                abstractC47211Ktk = AbstractC47211Ktk.A0W;
                            }
                            jSONObject.put("interactive_user_id", str4);
                            jSONObject.put("interactive_sticker_id", str5);
                        }
                    } catch (JSONException unused) {
                        C0w9.A03("DirectMessageApi", "Error accessing collection id for post");
                    }
                    if (abstractC47211Ktk != null) {
                        LLX.A06(c25621Ms, abstractC47211Ktk, jSONObject);
                    }
                }
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        C14360o3.A0F("interactiveSticker");
        throw C00O.createAndThrow();
    }

    public C31171eM(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
