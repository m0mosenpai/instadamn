package com.instagram.video.live.mvvm.viewmodel.optionsdialog;

import X.AbstractC07080Za;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.AbstractC52922bZ;
import X.C14360o3;
import X.C147776l2;
import X.C147856lA;
import X.C171547kk;
import X.C24721Ip;
import X.C54810OKj;
import X.C56805PIw;
import X.C57168PZm;
import X.C57582kX;
import X.EnumC142806cg;
import X.InterfaceC11380iw;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.JQ0;
import X.MSZ;
import X.MTU;
import X.OBA;
import X.OLC;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class IgLiveOptionsDialogViewModel extends AbstractC52922bZ {
    public OBA A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C171547kk A03;
    public final C57582kX A04;
    public final IgLiveFollowStatusApi A05;
    public final EnumC142806cg A06;
    public final C56805PIw A07;
    public final C54810OKj A08;
    public final C147776l2 A09;
    public final IgLiveCommentsRepository A0A;
    public final IgLiveModerationRepository A0B;
    public final IgLiveBroadcastInfoManager A0C;
    public final C147856lA A0D;
    public final IgLiveHeartbeatManager A0E;
    public final OLC A0F;
    public final MTU A0G;
    public final InterfaceC24731Iq A0H;
    public final InterfaceC19390xP A0I;

    public /* synthetic */ IgLiveOptionsDialogViewModel(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgLiveFollowStatusApi igLiveFollowStatusApi, EnumC142806cg enumC142806cg, OBA oba, C56805PIw c56805PIw, C54810OKj c54810OKj, C147776l2 c147776l2, IgLiveCommentsRepository igLiveCommentsRepository, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu) {
        C171547kk A00 = C171547kk.A03.A00(userSession);
        C57582kX A002 = C57582kX.A00(userSession);
        JQ0.A1O(userSession, enumC142806cg, interfaceC11380iw, igLiveCommentsRepository, igLiveBroadcastInfoManager);
        C14360o3.A0B(igLiveHeartbeatManager, 6);
        AbstractC25233BEq.A0y(7, mtu, igLiveModerationRepository, olc);
        AbstractC25229BEm.A1N(c147856lA, 10, c54810OKj);
        C14360o3.A0B(A00, 15);
        this.A02 = userSession;
        this.A06 = enumC142806cg;
        this.A01 = interfaceC11380iw;
        this.A0A = igLiveCommentsRepository;
        this.A0C = igLiveBroadcastInfoManager;
        this.A0E = igLiveHeartbeatManager;
        this.A0G = mtu;
        this.A0B = igLiveModerationRepository;
        this.A0F = olc;
        this.A0D = c147856lA;
        this.A05 = igLiveFollowStatusApi;
        this.A07 = c56805PIw;
        this.A09 = c147776l2;
        this.A08 = c54810OKj;
        this.A03 = A00;
        this.A04 = A002;
        this.A00 = oba;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A0H = A12;
        this.A0I = AbstractC07080Za.A03(A12);
        MSZ.A17(this, new C57168PZm(this, (InterfaceC23621Ds) null, 19), mtu.A00);
    }

    public static Iterable A00(IgLiveOptionsDialogViewModel igLiveOptionsDialogViewModel) {
        return (Iterable) igLiveOptionsDialogViewModel.A0F.A0V.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r30 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (X.AbstractC31175DnJ.A1X(r25, r28) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r26 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r30 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        if ((r26 instanceof X.C56803PIu) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        if ((r26 instanceof X.C56803PIu) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        if (r24.A04.A0N(r25) != com.instagram.user.model.FollowStatus.A06) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        if (r24.A04.A0N(r25) != com.instagram.user.model.FollowStatus.A05) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.user.model.User r25, X.InterfaceC58171Pqb r26, java.lang.String r27, java.util.List r28, X.InterfaceC23621Ds r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel.A01(com.instagram.user.model.User, X.Pqb, java.lang.String, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ca, code lost:
    
        if (r6.contains(r11.getId()) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e2, code lost:
    
        if (r30.A04.A0N(r11) != com.instagram.user.model.FollowStatus.A06) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fa, code lost:
    
        if (r30.A04.A0N(r11) != com.instagram.user.model.FollowStatus.A05) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020e, code lost:
    
        if (r11.CQf() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        if (r6.contains(r11.getId()) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0113, code lost:
    
        if (r35 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        if (r35 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        if (r35 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0150, code lost:
    
        if (r35 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        if (r11.A03.BNz() != com.instagram.api.schemas.IGLiveModeratorStatus.A04) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if ((r32 instanceof X.C56802PIt) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.user.model.User r31, X.InterfaceC58171Pqb r32, java.lang.String r33, X.InterfaceC23621Ds r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel.A02(com.instagram.user.model.User, X.Pqb, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }
}
