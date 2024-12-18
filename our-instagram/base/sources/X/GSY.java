package X;

import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class GSY extends C06840Yb implements InterfaceC16590sC {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GSY(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L12
            java.lang.Class<X.Jmj> r3 = X.C44539Jmj.class
            r1 = 5
            java.lang.String r4 = "createEmojiUiState"
            java.lang.String r5 = "createEmojiUiState(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)Lcom/instagram/direct/reactions/customize/viewmodel/DirectReactionsPickerViewModel$EmojisUiState;"
        Lc:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L12:
            java.lang.Class<com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel> r3 = com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.class
            r1 = 5
            java.lang.String r4 = "calculateViewState"
            java.lang.String r5 = "calculateViewState(Lcom/instagram/direct/fragment/channels/discovery/base/ChannelDiscoveryViewModel$FetchStatus;Lcom/instagram/direct/fragment/channels/discovery/model/SearchSurface;Ljava/util/List;Ljava/util/List;)Lcom/instagram/direct/fragment/channels/discovery/base/ChannelDiscoveryViewModel$ViewState;"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSY.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractCollection, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Integer num;
        if (this.A00 != 0) {
            return new E9K((List) obj4, (java.util.Set) obj, (java.util.Set) obj2, (java.util.Set) obj3);
        }
        EnumC33356Eop enumC33356Eop = (EnumC33356Eop) obj;
        EnumC33424Epv enumC33424Epv = (EnumC33424Epv) obj2;
        List list = (List) obj3;
        Collection collection = (Collection) obj4;
        ChannelDirectoryInboxViewModel channelDirectoryInboxViewModel = (ChannelDirectoryInboxViewModel) this.receiver;
        ArrayList A1N = AbstractC16960so.A1N(new C36184Fxy(enumC33424Epv));
        if (((ChannelDiscoveryViewModel) channelDirectoryInboxViewModel).A01 && enumC33424Epv == EnumC33424Epv.A06 && AbstractC166987dD.A1b(list)) {
            int A07 = AbstractC25225BEi.A07(C06090Tz.A05, channelDirectoryInboxViewModel.A04, 36599383426141708L);
            boolean A1O = AbstractC167007dF.A1O(A07);
            Integer num2 = C05F.A01;
            if (A1O && list.size() <= A07) {
                num = null;
            } else {
                num = 2131959649;
            }
            A1N.add(new C43960Jc9(num2, num, "channel_directory_invites_header", 2131959581, false, AbstractC25229BEm.A1a(channelDirectoryInboxViewModel.A05, EnumC33329EoO.A02)));
            ?? A1E = AbstractC166987dD.A1E();
            for (Object obj6 : list) {
                AbstractC25228BEl.A1Q(obj6, A1E, channelDirectoryInboxViewModel.A06.contains(((C32099E8x) obj6).A07) ? 1 : 0);
            }
            if (A1O) {
                A1E = AbstractC001800i.A0d(A1E, A07);
            }
            A1N.addAll(A1E);
            if (((ChannelDiscoveryViewModel) channelDirectoryInboxViewModel).A02) {
                A1N.add(new C43960Jc9(C05F.A00, null, "channel_directory_suggestions_header", 2131959690, true, true));
            }
        }
        A1N.addAll(collection);
        return new FIV(enumC33356Eop, A1N);
    }
}
