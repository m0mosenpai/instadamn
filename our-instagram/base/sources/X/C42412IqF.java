package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IqF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42412IqF implements InterfaceC43448JHm {
    public java.util.Set A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final DiscoveryChainingItem A04;
    public final InterfaceC61432r6 A05;
    public final String A06;

    public C42412IqF(Context context, UserSession userSession, DiscoveryChainingItem discoveryChainingItem, InterfaceC60442pS interfaceC60442pS, InterfaceC61432r6 interfaceC61432r6, String str) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A04 = discoveryChainingItem;
        this.A06 = str;
        this.A05 = interfaceC61432r6;
    }

    @Override // X.InterfaceC43448JHm
    public final C25621Ms Bo1(InterfaceC65262xO interfaceC65262xO) {
        String str;
        String str2;
        UserSession userSession = this.A02;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        DiscoveryChainingItem discoveryChainingItem = this.A04;
        VideoFeedType videoFeedType = discoveryChainingItem.A02;
        if (videoFeedType != null) {
            int ordinal = videoFeedType.ordinal();
            if (ordinal != 0 && ordinal != 2) {
                if (ordinal == 3) {
                    str = "fbsearch/channel_viewer/%s/%s/";
                }
            } else {
                str = "channels/viewer/%s/%s/";
            }
            String str3 = discoveryChainingItem.A0J;
            String str4 = discoveryChainingItem.A0B;
            A0c.A0L(str, str3, str4);
            A0c.A9s("rank_token", AbstractC166997dE.A0n());
            A0c.A9s("module", this.A06);
            A0c.A0P(null, C39138HKr.class, IT7.class, false);
            if (ordinal != 0 && ordinal != 2) {
                if (ordinal == 3) {
                    str2 = "fbsearch/channel_viewer/%s/%s/";
                } else {
                    throw AbstractC37303Gc4.A0M(videoFeedType, "Invalid VideoFeedType: ", AbstractC166987dD.A1C());
                }
            } else {
                str2 = "channels/viewer/%s/%s/";
            }
            Map AUS = this.A05.AUS(AbstractC001800i.A0P("/", "", "", AbstractC16960so.A1Q(str2, str3, str4), null));
            this.A00 = AbstractC85703rz.A01(AUS);
            Map A00 = AbstractC85703rz.A00(AUS);
            if (!A00.isEmpty()) {
                Iterator A15 = AbstractC166997dE.A15(A00);
                while (A15.hasNext()) {
                    AbstractC37303Gc4.A16(A0c, A15);
                }
            }
            FBx(EnumC74603Ws.A06, false);
            AbstractC37301Gc2.A0t(this.A01, A0c, userSession);
            AbstractC40600HzK.A00(A0c, interfaceC65262xO);
            return A0c;
        }
        throw AbstractC37303Gc4.A0M(videoFeedType, "Invalid VideoFeedType: ", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC43448JHm
    public final void FBx(EnumC74603Ws enumC74603Ws, boolean z) {
        C14360o3.A0B(enumC74603Ws, 0);
        java.util.Set set = this.A00;
        if (set != null) {
            this.A05.FCF(enumC74603Ws, set);
            if (z) {
                this.A00 = null;
            }
        }
    }

    @Override // X.InterfaceC43448JHm
    public final C23711Eb C2d(InterfaceC65262xO interfaceC65262xO) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC43448JHm
    public final /* bridge */ /* synthetic */ IKC E3W(InterfaceC40821up interfaceC40821up, int i) {
        C74293Vk c74293Vk = (C74293Vk) interfaceC40821up;
        C14360o3.A0B(c74293Vk, 0);
        List list = c74293Vk.A06;
        C14360o3.A07(list);
        ArrayList A1F = AbstractC166987dD.A1F(list);
        ArrayList A01 = C3ZG.A01(this.A01, this.A03, this.A02, list, i);
        Map emptyMap = Collections.emptyMap();
        C14360o3.A07(emptyMap);
        boolean A1W = AbstractC167007dF.A1W(c74293Vk.A04);
        HashMap hashMap = c74293Vk.A05;
        if (hashMap != null) {
            emptyMap = hashMap;
        }
        return new IKC(null, null, null, A1F, A01, list, emptyMap, A1W);
    }
}
