package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.reels.interactive.view.AvatarView;

/* renamed from: X.WiR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70861WiR implements InterfaceC25184BCh, InterfaceC37172GZj {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public EditText A05;
    public ImageUrl A06;
    public IgTextView A07;
    public IgTextView A08;
    public ChatStickerChannelType A09;
    public C24012Akq A0A;
    public AvatarView A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public C189478aR A0G;
    public final Context A0H;
    public final View.OnFocusChangeListener A0I;
    public final FragmentActivity A0J;
    public final UserSession A0K;
    public final XEW A0L;
    public final InterfaceC1810081c A0M;
    public final C8NX A0N;
    public final C68091VAh A0O;
    public final InterfaceC195198kL A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final boolean A0T;
    public final C8O8 A0U;
    public final C68091VAh A0V;
    public final String A0W;

    public C70861WiR(View view, FragmentActivity fragmentActivity, UserSession userSession, C3I9 c3i9, C8O8 c8o8, XEW xew, InterfaceC1810081c interfaceC1810081c, C8NX c8nx, String str) {
        boolean z;
        Boolean BCU;
        C14360o3.A0B(c8o8, 7);
        this.A0W = str;
        this.A0J = fragmentActivity;
        this.A0K = userSession;
        this.A0M = interfaceC1810081c;
        this.A0N = c8nx;
        this.A0L = xew;
        this.A0U = c8o8;
        this.A0H = view.getContext();
        this.A0R = AbstractC09440dt.A01(new C50151MDe(view, 45));
        this.A0O = new C68091VAh(this, 0);
        this.A0V = new C68091VAh(this, 1);
        this.A0P = new C24161Ank(this, 1);
        this.A0S = AbstractC09440dt.A01(new B61(19, c3i9, this));
        this.A0I = new WNY(this, 5);
        this.A0Q = AbstractC09440dt.A01(X4X.A00);
        this.A0E = "";
        this.A0D = "";
        InterfaceC81183jn BdE = C17060sy.A01.A01(userSession).A03.BdE();
        if (BdE != null && (BCU = BdE.BCU()) != null) {
            z = BCU.booleanValue();
        } else {
            z = false;
        }
        this.A0T = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fc, code lost:
    
        if (r0 == null) goto L74;
     */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70861WiR.DDv(java.lang.Object):void");
    }

    public static final void A00(C70861WiR c70861WiR) {
        EditText editText = c70861WiR.A05;
        if (editText != null) {
            if (editText.hasFocus()) {
                EditText editText2 = c70861WiR.A05;
                if (editText2 != null) {
                    editText2.clearFocus();
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("chatNameView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37172GZj
    public final void D8E() {
        this.A0E = "";
        this.A0D = "";
        this.A01 = 0;
        this.A09 = null;
        this.A00 = 0;
        this.A0C = null;
        this.A06 = C17060sy.A01.A01(this.A0K).Bhu();
        EditText editText = this.A05;
        if (editText == null) {
            C14360o3.A0F("chatNameView");
            throw C00O.createAndThrow();
        }
        editText.setText(this.A0E);
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = this.A0J;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (A00 != null) {
            A00.A0S(this.A0V);
        }
        C3DN A002 = c3do.A00(fragmentActivity);
        if (A002 != null) {
            A002.A0R(this.A0O);
        }
        C189478aR c189478aR = this.A0G;
        if (c189478aR != null) {
            c189478aR.A07();
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        long j;
        XEW xew = this.A0L;
        if (xew.C0a().CWW()) {
            AbstractC125325le.A05(new View[]{(View) this.A0R.getValue(), xew.C0a().getView()}, true);
            A00(this);
        }
        C8NX c8nx = this.A0N;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        Integer valueOf = Integer.valueOf(this.A00);
        ChatStickerChannelType chatStickerChannelType = this.A09;
        ChatStickerChannelType chatStickerChannelType2 = chatStickerChannelType;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = xew.AnJ();
        }
        if (chatStickerChannelType2 == null) {
            chatStickerChannelType2 = xew.AnJ();
        }
        if (chatStickerChannelType2 == ChatStickerChannelType.A09) {
            j = SandboxRepository.CACHE_TTL;
        } else {
            j = -1;
        }
        Long valueOf2 = Long.valueOf(j);
        String A00 = AbstractC43591JPw.A00(473);
        ImageUrl imageUrl = this.A06;
        if (imageUrl == null) {
            C14360o3.A0F("avatarUrl");
            throw C00O.createAndThrow();
        }
        String url = imageUrl.getUrl();
        c8nx.Dog(AbstractC69977Vyu.A01(VW4.A00(null, null, null, chatStickerChannelType, ChatStickerStickerType.A07, null, true, null, 0, valueOf, 0, Integer.valueOf(this.A01), valueOf2, null, null, A00, url, null, this.A0C, null, this.A0D, null, this.A0E, null)), xew.C2K());
        this.A0A = null;
        this.A0U.Doh(this.A0W);
    }

    @Override // X.InterfaceC37172GZj
    public final void DIb(int i) {
        C193328hC c193328hC = new C193328hC((Activity) this.A0J);
        c193328hC.A0A(2131955119);
        c193328hC.A0r(AbstractC31177DnL.A0a(this.A0H, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 2131955118));
        c193328hC.A0R(null, EnumC193348hE.A04, 2131968948);
        AbstractC166987dD.A1W(c193328hC);
    }

    public static final void A01(C70861WiR c70861WiR, String str) {
        C68091VAh c68091VAh;
        A00(c70861WiR);
        AbstractC167007dF.A0x(c70861WiR.A07);
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = c70861WiR.A0J;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (str != null) {
            if (A00 != null) {
                c68091VAh = c70861WiR.A0V;
                A00.A0R(c68091VAh);
            }
        } else if (A00 != null) {
            c68091VAh = c70861WiR.A0O;
            A00.A0R(c68091VAh);
        }
        UserSession userSession = c70861WiR.A0K;
        KZH kzh = (KZH) c70861WiR.A0Q.getValue();
        boolean z = c70861WiR.A0F;
        C14360o3.A0B(kzh, 2);
        V7U v7u = new V7U();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        if (str != null) {
            A05.putString(AbstractC43591JPw.A00(278), str);
        }
        A05.putBoolean("IS_CAMERA_DESTINATION_CLIPS_KEY", z);
        v7u.setArguments(A05);
        v7u.A01 = c70861WiR;
        v7u.A00 = kzh;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0T = v7u;
        c189448aO.A0d = c70861WiR.A0H.getString(2131955131);
        c70861WiR.A0G = c189448aO.A00().A02(fragmentActivity, v7u);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // X.InterfaceC37172GZj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dsr(com.instagram.common.typedurl.ImageUrl r4, java.lang.String r5, java.lang.String r6, int r7, int r8, int r9) {
        /*
            r3 = this;
            X.AbstractC167017dG.A1N(r5, r6)
            r3.A0E = r6
            r3.A0D = r5
            r3.A06 = r4
            r3.A01 = r7
            r0 = 28
            r2 = 0
            if (r8 == r0) goto L56
            r0 = 29
            if (r8 == r0) goto L53
            r0 = 32
            if (r8 == r0) goto L50
            r0 = 61
            if (r8 == r0) goto L56
            r0 = 62
            if (r8 == r0) goto L50
            java.lang.String r1 = "ChatStickerEditorController"
            java.lang.String r0 = "Unknown thread subtype passed for join chat sticker"
            X.AbstractC12120kG.A0E(r1, r0, r2)
        L27:
            r3.A09 = r2
            r3.A00 = r9
            java.lang.String r0 = "share_existing_channel_sheet"
            r3.A0C = r0
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r3.A0J
            X.3DN r1 = r1.A00(r0)
            if (r1 == 0) goto L3e
            X.VAh r0 = r3.A0O
            r1.A0S(r0)
        L3e:
            X.8aR r0 = r3.A0G
            if (r0 == 0) goto L45
            r0.A07()
        L45:
            X.81c r1 = r3.A0M
            X.8Vk r0 = new X.8Vk
            r0.<init>()
            r1.E4u(r0)
            return
        L50:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.A07
            goto L27
        L53:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.A05
            goto L27
        L56:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.A09
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70861WiR.Dsr(com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, int, int, int):void");
    }
}
