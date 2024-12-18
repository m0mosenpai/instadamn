package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.7Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160627Hw {
    public View A00;
    public TextView A01;
    public Integer A02;
    public Number A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final ViewStub A0A;
    public final InterfaceC11380iw A0B;
    public final UserSession A0C;
    public final C159787Eq A0D;
    public final C7OA A0E;
    public final InterfaceC83703oF A0F;
    public final C7OC A0G;
    public final Integer A0H;
    public final String A0I;
    public final java.util.Set A0J;
    public final List A0K;
    public static final java.util.Set A0M = AbstractC16830sb.A07(C7O9.MENTION, C7O9.EMOJI_REACTION, C7O9.REPLY, C2EY.A1F, C2EY.A1x, C2EY.A1g, C2EY.A22, C2EY.A0W, C2EY.A1r, C2EY.A0t, C2EY.A1t);
    public static final java.util.Set A0L = AbstractC16830sb.A07("❤️", "👍", "😢", "😍", "😮", "😂", "👏");

    public C160627Hw(Context context, ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159787Eq c159787Eq, InterfaceC83703oF interfaceC83703oF, List list) {
        Integer num;
        C14360o3.A0B(viewStub, 4);
        C14360o3.A0B(list, 7);
        this.A09 = context;
        this.A0C = userSession;
        this.A0B = interfaceC11380iw;
        this.A0A = viewStub;
        this.A0D = c159787Eq;
        this.A0F = interfaceC83703oF;
        this.A0K = list;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36314859020815217L) && !C18U.A06(c06090Tz, userSession, 36314859020946290L)) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36314859021077363L);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A00;
        }
        this.A0H = num;
        String A02 = AbstractC92784Dr.A02(interfaceC83703oF);
        this.A0I = A02 == null ? "" : A02;
        this.A0J = new LinkedHashSet();
        this.A0E = new C7OA(interfaceC11380iw, userSession, num, list);
        this.A0G = new C7OC() { // from class: X.7OB
            @Override // X.C7OC
            public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
                C14360o3.A0B(c148336m3, 0);
                C160627Hw c160627Hw = C160627Hw.this;
                String str = c148336m3.A02;
                java.util.Set set = C160627Hw.A0M;
                C160627Hw.A01(c160627Hw, str, AbstractC001800i.A03(c160627Hw.A0J, c148336m3.A01));
            }
        };
    }

    public static final void A01(C160627Hw c160627Hw, String str, int i) {
        c160627Hw.A05 = false;
        A02(c160627Hw, true);
        c160627Hw.A0D.A00.A1i.A06(null, str, null);
        C7OA c7oa = c160627Hw.A0E;
        String str2 = c160627Hw.A0I;
        String str3 = c160627Hw.A04;
        if (str3 == null) {
            C14360o3.A0F("lastMessageReelTypeForLogging");
            throw C00O.createAndThrow();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        hashMap.put("message_type", str3);
        hashMap.put("button_index", String.valueOf(i));
        C7OA.A00(c7oa, "emoji_tray_click", hashMap);
    }

    public static final void A00(C160627Hw c160627Hw) {
        String str;
        View view = c160627Hw.A00;
        if (view == null) {
            str = "emojiContainerView";
        } else {
            Number number = c160627Hw.A03;
            if (number == null) {
                str = "backgroundColor";
            } else {
                view.setBackgroundColor(number.intValue());
                TextView textView = c160627Hw.A01;
                if (textView == null) {
                    str = "helperTextView";
                } else {
                    Integer num = c160627Hw.A02;
                    if (num != null) {
                        textView.setTextColor(num.intValue());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final boolean A03() {
        if (this.A07) {
            View view = this.A00;
            if (view == null) {
                C14360o3.A0F("emojiContainerView");
                throw C00O.createAndThrow();
            }
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final void A02(C160627Hw c160627Hw, boolean z) {
        if (c160627Hw.A03()) {
            if (!z) {
                View view = c160627Hw.A00;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
            } else {
                if (c160627Hw.A06) {
                    return;
                }
                c160627Hw.A06 = true;
                View view2 = c160627Hw.A00;
                if (view2 != null) {
                    AbstractC125325le A01 = AbstractC125325le.A01(view2, 0);
                    A01.A0G();
                    AbstractC125325le A0F = A01.A0F(true);
                    if (c160627Hw.A00 != null) {
                        A0F.A0T(0.0f, r0.getMeasuredHeight());
                        A0F.A03 = 8;
                        A0F.A05 = new C24082AmR(c160627Hw);
                        A0F.A0H();
                        return;
                    }
                }
            }
            C14360o3.A0F("emojiContainerView");
            throw C00O.createAndThrow();
        }
    }
}
