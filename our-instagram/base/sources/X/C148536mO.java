package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.UUID;

/* renamed from: X.6mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148536mO {
    public Fragment A00;
    public C84823qW A01;
    public C51622Yk A02;
    public final int A03;
    public final Context A04;
    public final View A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final InterfaceC148526mN A08;
    public final C38E A09;
    public final InterfaceC60442pS A0A;

    public C148536mO(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC148526mN interfaceC148526mN) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC148526mN, 7);
        this.A04 = context;
        this.A0A = interfaceC60442pS;
        this.A05 = view;
        this.A07 = userSession;
        this.A06 = abstractC59962oe;
        this.A08 = interfaceC148526mN;
        this.A09 = new C38E(abstractC59962oe, userSession, new C38C(abstractC59962oe, -1));
        this.A03 = context.getResources().getDimensionPixelOffset(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public final void A02(MusicOverlayStickerModel musicOverlayStickerModel) {
        FragmentActivity activity = this.A06.getActivity();
        if (activity != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                C4A1.A00(A0A, musicOverlayStickerModel, true);
                A0A.close();
                String obj = stringWriter.toString();
                UserSession userSession = this.A07;
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putString("source_media_id", null);
                if (obj != null) {
                    bundle.putString("music_sticker_model_json", obj);
                }
                C38928HCb c38928HCb = new C38928HCb();
                c38928HCb.setArguments(bundle);
                String obj2 = UUID.randomUUID().toString();
                C14360o3.A07(obj2);
                c38928HCb.A0B = new IF4(this, obj2);
                c38928HCb.A08 = new C42729IvP(this);
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0T = new C29379CxC(this);
                c189448aO.A00().A02(activity, c38928HCb);
            } catch (IOException unused) {
                this.A08.Ddm();
                C0w9.A03("ReelInteractiveController", "Could not json serialize MusicOverlayStickerModel for the music consumption sheet");
            }
        }
    }

    private final void A00(C41743IeH c41743IeH) {
        String str = c41743IeH.A06;
        if (str != null && str.length() != 0) {
            this.A08.ELF(str, c41743IeH.A0A);
        }
    }

    public final boolean A04() {
        C51622Yk c51622Yk = this.A02;
        if (c51622Yk != null && c51622Yk.isShowing()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d6, code lost:
    
        if (r27.A0k != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        if (X.C18U.A06(r5, r15, r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (X.C18U.A06(r5, r15, r3) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0612, code lost:
    
        if (r3 != null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r3.A00 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if ("upcoming_event_card".equals(r27.A1h) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r15, 36319377331264870L) == false) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:192:0x03f0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00e1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.C84823qW r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148536mO.A05(X.3qW, int, int):boolean");
    }

    public final void A01(MusicOverlayStickerModel musicOverlayStickerModel) {
        Bundle A02 = AbstractC86593tX.A02(null, C8JW.A0Z, AbstractC41763Iee.A05(musicOverlayStickerModel), UUID.randomUUID().toString());
        UserSession userSession = this.A07;
        C14360o3.A0B(A02, 1);
        C38929HCc c38929HCc = new C38929HCc();
        c38929HCc.setArguments(A02);
        this.A00 = c38929HCc;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.66f;
        c189448aO.A0U = new C29384CxH(this);
        c189448aO.A0T = c38929HCc;
        c189448aO.A00().A02(this.A06.requireActivity(), c38929HCc);
    }

    public final void A03(C84823qW c84823qW, boolean z, boolean z2) {
        if (A04()) {
            if (z2) {
                C51622Yk c51622Yk = this.A02;
                if (c51622Yk != null) {
                    c51622Yk.A03 = null;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C51622Yk c51622Yk2 = this.A02;
            if (c51622Yk2 != null) {
                c51622Yk2.A03(z);
                this.A01 = null;
                if (c84823qW != null) {
                    c84823qW.A1I = false;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
