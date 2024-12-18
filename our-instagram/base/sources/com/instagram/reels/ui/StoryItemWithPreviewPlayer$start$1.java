package com.instagram.reels.ui;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC127285p6;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C129025sN;
import X.C14360o3;
import X.C1JX;
import X.C3G4;
import X.C3Y7;
import X.C41181vS;
import X.C4QP;
import X.C54726OFd;
import X.C73203Pv;
import X.C75113Zb;
import X.C81343k4;
import X.InterfaceC11380iw;
import X.InterfaceC124075jM;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC64002vL;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$1", f = "StoryItemWithPreviewPlayer.kt", i = {0}, l = {201}, m = "invokeSuspend", n = {"allItems"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class StoryItemWithPreviewPlayer$start$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public boolean A0B;
    public final /* synthetic */ int A0C;
    public final /* synthetic */ InterfaceC11380iw A0D;
    public final /* synthetic */ C3Y7 A0E;
    public final /* synthetic */ C75113Zb A0F;
    public final /* synthetic */ C3G4 A0G;
    public final /* synthetic */ C129025sN A0H;
    public final /* synthetic */ C54726OFd A0I;
    public final /* synthetic */ C73203Pv A0J;
    public final /* synthetic */ C4QP A0K;
    public final /* synthetic */ boolean A0L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryItemWithPreviewPlayer$start$1(InterfaceC11380iw interfaceC11380iw, C3Y7 c3y7, C75113Zb c75113Zb, C3G4 c3g4, C129025sN c129025sN, C54726OFd c54726OFd, C73203Pv c73203Pv, C4QP c4qp, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A0G = c3g4;
        this.A0H = c129025sN;
        this.A0C = i;
        this.A0J = c73203Pv;
        this.A0E = c3y7;
        this.A0I = c54726OFd;
        this.A0F = c75113Zb;
        this.A0L = z;
        this.A0K = c4qp;
        this.A0D = interfaceC11380iw;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C3G4 c3g4 = this.A0G;
        C129025sN c129025sN = this.A0H;
        int i = this.A0C;
        C73203Pv c73203Pv = this.A0J;
        C3Y7 c3y7 = this.A0E;
        C54726OFd c54726OFd = this.A0I;
        C75113Zb c75113Zb = this.A0F;
        boolean z = this.A0L;
        return new StoryItemWithPreviewPlayer$start$1(this.A0D, c3y7, c75113Zb, c3g4, c129025sN, c54726OFd, c73203Pv, this.A0K, interfaceC23621Ds, i, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C3G4 c3g4;
        C129025sN c129025sN;
        List A0O;
        C73203Pv c73203Pv;
        C3Y7 c3y7;
        C54726OFd c54726OFd;
        C75113Zb c75113Zb;
        boolean z;
        C4QP c4qp;
        InterfaceC11380iw interfaceC11380iw;
        Iterator it;
        C41181vS c41181vS;
        C81343k4 c81343k4;
        Reel reel;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            z = this.A0B;
            it = (Iterator) this.A0A;
            interfaceC11380iw = (InterfaceC11380iw) this.A09;
            c4qp = (C4QP) this.A08;
            c75113Zb = (C75113Zb) this.A07;
            c129025sN = (C129025sN) this.A06;
            c54726OFd = (C54726OFd) this.A05;
            c3y7 = (C3Y7) this.A04;
            c3g4 = (C3G4) this.A03;
            c73203Pv = (C73203Pv) this.A02;
            A0O = (List) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            c3g4 = this.A0G;
            c129025sN = this.A0H;
            UserSession userSession = c129025sN.A02;
            Reel reel2 = c3g4.A03;
            A0O = reel2.A0O(userSession);
            C14360o3.A07(A0O);
            int A03 = reel2.A03(userSession);
            ArrayList A0S = AbstractC001800i.A0S(A0O.subList(0, A03), A0O.subList(A03, A0O.size()));
            c73203Pv = this.A0J;
            c3y7 = this.A0E;
            c54726OFd = this.A0I;
            c75113Zb = this.A0F;
            z = this.A0L;
            c4qp = this.A0K;
            interfaceC11380iw = this.A0D;
            it = A0S.iterator();
        }
        do {
            if (it.hasNext()) {
                c41181vS = (C41181vS) it.next();
                if (C14360o3.A0K(c73203Pv.A02, c3g4)) {
                    int indexOf = A0O.indexOf(c41181vS);
                    c81343k4 = (C81343k4) c3y7;
                    SegmentedProgressBar segmentedProgressBar = c81343k4.A02;
                    if (segmentedProgressBar != null) {
                        segmentedProgressBar.setCurrentSegment(indexOf);
                    }
                    Context context = c54726OFd.A01;
                    UserSession userSession2 = c54726OFd.A03;
                    C73203Pv c73203Pv2 = c54726OFd.A09;
                    C3G4 c3g42 = c54726OFd.A05;
                    int i = c54726OFd.A00;
                    C3G4 c3g43 = c54726OFd.A06;
                    InterfaceC64002vL interfaceC64002vL = c54726OFd.A0A;
                    List list = c54726OFd.A0D;
                    String str = c54726OFd.A0C;
                    Integer num = c54726OFd.A0B;
                    InterfaceC124075jM interfaceC124075jM = c54726OFd.A08;
                    AbstractC127285p6.A00(context, c54726OFd.A02, userSession2, c54726OFd.A04, c41181vS, c3g42, c3g43, c54726OFd.A07, interfaceC124075jM, c73203Pv2, interfaceC64002vL, num, str, list, i);
                    reel = c3g4.A03;
                    this.A01 = A0O;
                    this.A02 = c73203Pv;
                    this.A03 = c3g4;
                    this.A04 = c3y7;
                    this.A05 = c54726OFd;
                    this.A06 = c129025sN;
                    this.A07 = c75113Zb;
                    this.A08 = c4qp;
                    this.A09 = interfaceC11380iw;
                    this.A0A = it;
                    this.A0B = z;
                    this.A00 = 1;
                }
            } else {
                this.A0H.A05.A00.A08.A0o(this.A0C + 1);
            }
            return C0eB.A00;
        } while (C129025sN.A00(interfaceC11380iw, c75113Zb, reel, c41181vS, c3g4, c81343k4, c129025sN, c4qp, this, z) != c1jx);
        return c1jx;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryItemWithPreviewPlayer$start$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
