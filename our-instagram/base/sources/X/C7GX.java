package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7GX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7GX {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7GX[] A02;
    public static final C7GX A03;
    public static final C7GX A04;
    public static final C7GX A05;
    public static final C7GX A06;
    public static final C7GX A07;
    public static final C7GX A08;
    public static final C7GX A09;
    public static final C7GX A0A;
    public static final C7GX A0B;
    public static final C7GX A0C;
    public static final C7GX A0D;
    public static final C7GX A0E;
    public static final C7GX A0F;
    public static final C7GX A0G;
    public static final C7GX A0H;
    public static final C7GX A0I;
    public static final C7GX A0J;
    public static final C7GX A0K;
    public static final C7GX A0L;
    public static final C7GX A0M;
    public static final C7GX A0N;
    public static final C7GX A0O;
    public static final C7GX A0P;
    public static final C7GX A0Q;
    public static final C7GX A0R;
    public static final C7GX A0S;
    public static final C7GX A0T;
    public final String A00;

    static {
        C7GX c7gx = new C7GX("CAMERA", 0, "camera");
        A03 = c7gx;
        C7GX c7gx2 = new C7GX("GALLERY", 1, "gallery");
        A06 = c7gx2;
        C7GX c7gx3 = new C7GX("SEND", 2, "send");
        A0N = c7gx3;
        C7GX c7gx4 = new C7GX("PLUS", 3, "plus");
        A0H = c7gx4;
        C7GX c7gx5 = new C7GX("STICKER", 4, "sticker");
        A0P = c7gx5;
        C7GX c7gx6 = new C7GX("STICKER_SEARCH", 5, "sticker_search");
        A0Q = c7gx6;
        C7GX c7gx7 = new C7GX("QUICK_REPLY", 6, "quick_reply");
        A0L = c7gx7;
        C7GX c7gx8 = new C7GX("QUICK_REPLY_HIGHLIGHTED", 7, "quick_reply_highlighted");
        A0M = c7gx8;
        C7GX c7gx9 = new C7GX("PRODUCT_PICKER", 8, "product_picker");
        A0J = c7gx9;
        C7GX c7gx10 = new C7GX("ORDER_MANAGEMENT", 9, "order_management");
        A0F = c7gx10;
        C7GX c7gx11 = new C7GX("P2M_PAYMENT_REQUEST", 10, "p2m_payment_request");
        A0G = c7gx11;
        C7GX c7gx12 = new C7GX("VOICE_MESSAGE", 11, "voice_message");
        A0S = c7gx12;
        C7GX c7gx13 = new C7GX("QUESTION", 12, "question");
        A0K = c7gx13;
        C7GX c7gx14 = new C7GX("CHALLENGES", 13, "challenges");
        A04 = c7gx14;
        C7GX c7gx15 = new C7GX("DAILY_PROMPT", 14, "daily_prompt");
        A05 = c7gx15;
        C7GX c7gx16 = new C7GX("POLL", 15, "poll");
        A0I = c7gx16;
        C7GX c7gx17 = new C7GX("LOCATION", 16, "location_sharing");
        A09 = c7gx17;
        C7GX c7gx18 = new C7GX("IMAGINE", 17, "imagine");
        A07 = c7gx18;
        C7GX c7gx19 = new C7GX("STICKER_SUGGESTIONS", 18, "sticker_suggestions");
        A0R = c7gx19;
        C7GX c7gx20 = new C7GX("SEND_FILE", 19, "send_file");
        A0O = c7gx20;
        C7GX c7gx21 = new C7GX("MORE", 20, "more");
        A0D = c7gx21;
        C7GX c7gx22 = new C7GX("META_AI_DISCOVERY", 21, "meta_ai_discovery");
        A0A = c7gx22;
        C7GX c7gx23 = new C7GX("WRITE_WITH_AI", 22, "write_with_ai");
        A0T = c7gx23;
        C7GX c7gx24 = new C7GX("LIVE", 23, "live");
        A08 = c7gx24;
        C7GX c7gx25 = new C7GX("META_AI_VOICE", 24, "meta_ai_voice");
        A0C = c7gx25;
        C7GX c7gx26 = new C7GX("META_AI_INVOCATION", 25, "meta_ai_invocation");
        A0B = c7gx26;
        C7GX c7gx27 = new C7GX(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 26, NetInfoModule.CONNECTION_TYPE_NONE);
        A0E = c7gx27;
        C7GX[] c7gxArr = {c7gx, c7gx2, c7gx3, c7gx4, c7gx5, c7gx6, c7gx7, c7gx8, c7gx9, c7gx10, c7gx11, c7gx12, c7gx13, c7gx14, c7gx15, c7gx16, c7gx17, c7gx18, c7gx19, c7gx20, c7gx21, c7gx22, c7gx23, c7gx24, c7gx25, c7gx26, c7gx27};
        A02 = c7gxArr;
        A01 = AbstractC12190kN.A00(c7gxArr);
    }

    public static C7GX valueOf(String str) {
        return (C7GX) Enum.valueOf(C7GX.class, str);
    }

    public static C7GX[] values() {
        return (C7GX[]) A02.clone();
    }

    public C7GX(String str, int i, String str2) {
        this.A00 = str2;
    }
}
