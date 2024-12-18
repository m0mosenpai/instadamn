package com.instagram.video.live.mvvm.viewmodel.composer;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC23611Dp;
import X.AbstractC31177DnL;
import X.C0eB;
import X.C14360o3;
import X.C145826hf;
import X.C16930sl;
import X.C1JX;
import X.C41551w4;
import X.C51026MgZ;
import X.C51699MsU;
import X.C51709Mse;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.OJ4;
import X.OT2;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel$onPostButtonTapped$1", f = "IgLiveComposerViewModel.kt", i = {0}, l = {DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD}, m = "invokeSuspend", n = {"broadcastInfo"}, s = {"L$1"})
/* loaded from: classes9.dex */
public final class IgLiveComposerViewModel$onPostButtonTapped$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C51026MgZ A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveComposerViewModel$onPostButtonTapped$1(C51026MgZ c51026MgZ, String str, InterfaceC23621Ds interfaceC23621Ds, int i, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = c51026MgZ;
        this.A07 = z;
        this.A06 = str;
        this.A04 = j;
        this.A03 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C51026MgZ c51026MgZ = this.A05;
        boolean z = this.A07;
        return new IgLiveComposerViewModel$onPostButtonTapped$1(c51026MgZ, this.A06, interfaceC23621Ds, this.A03, this.A04, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C51026MgZ c51026MgZ;
        C51709Mse c51709Mse;
        C41551w4 c41551w4;
        String str;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            c51709Mse = (C51709Mse) this.A02;
            c51026MgZ = (C51026MgZ) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            c51026MgZ = this.A05;
            c51709Mse = (C51709Mse) c51026MgZ.A09.A06.getValue();
            if (c51709Mse != null) {
                boolean z = this.A07;
                String str2 = this.A06;
                long j = this.A04;
                int i = this.A03;
                if (z) {
                    String str3 = ((C51699MsU) c51026MgZ.A0F.getValue()).A01;
                    int length = str3.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        int i3 = length;
                        if (!z2) {
                            i3 = i2;
                        }
                        boolean A19 = AbstractC167027dH.A19(str3, i3);
                        if (!z2) {
                            if (!A19) {
                                z2 = true;
                            } else {
                                i2++;
                            }
                        } else {
                            if (!A19) {
                                break;
                            }
                            length--;
                        }
                    }
                    str2 = AbstractC31177DnL.A0g(str3, length, i2);
                }
                c51026MgZ.A0F.getValue();
                C51026MgZ.A00(null, c51026MgZ, "", 3, false, false, false);
                String str4 = c51709Mse.A08;
                if (str4 != null) {
                    IgLiveCommentsRepository igLiveCommentsRepository = c51026MgZ.A07;
                    LiveUserPaySupportTier liveUserPaySupportTier = c51709Mse.A04;
                    int i4 = c51709Mse.A00;
                    boolean A1P = AbstractC167007dF.A1P(c51709Mse.A0J ? 1 : 0, 1);
                    long A00 = c51026MgZ.A0A.A00();
                    this.A01 = c51026MgZ;
                    this.A02 = c51709Mse;
                    this.A00 = 1;
                    if (igLiveCommentsRepository.A0A(liveUserPaySupportTier, str2, str4, this, i, i4, j, A00, A1P, z) == c1jx) {
                        return c1jx;
                    }
                }
            }
            return C0eB.A00;
        }
        OJ4 oj4 = c51026MgZ.A08;
        if (oj4 != null && (c41551w4 = oj4.A00) != null) {
            C145826hf c145826hf = c51026MgZ.A04;
            if (c145826hf != null) {
                UserSession userSession = c51026MgZ.A03;
                String str5 = c51709Mse.A09;
                long A03 = AbstractC167027dH.A03(C51709Mse.A00(c51709Mse));
                double A002 = c51026MgZ.A0A.A00();
                LiveUserPaySupportTier liveUserPaySupportTier2 = c51709Mse.A04;
                if (liveUserPaySupportTier2 != null) {
                    str = liveUserPaySupportTier2.name();
                } else {
                    str = null;
                }
                c145826hf.A05(c51026MgZ.A02, userSession, c41551w4, null, str5, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, str, null, null, A002, A03);
            } else {
                OT2 ot2 = c51026MgZ.A06;
                String str6 = c51709Mse.A09;
                String A003 = C51709Mse.A00(c51709Mse);
                String str7 = c51709Mse.A08;
                long A004 = c51026MgZ.A0A.A00();
                LiveUserPaySupportTier liveUserPaySupportTier3 = c51709Mse.A04;
                C16930sl c16930sl = C16930sl.A00;
                AbstractC167017dG.A1O(str6, str7);
                C14360o3.A0B(c16930sl, 6);
                OT2.A00(liveUserPaySupportTier3, null, ot2, str6, A003, str7, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, c16930sl, A004).Cht();
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgLiveComposerViewModel$onPostButtonTapped$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
