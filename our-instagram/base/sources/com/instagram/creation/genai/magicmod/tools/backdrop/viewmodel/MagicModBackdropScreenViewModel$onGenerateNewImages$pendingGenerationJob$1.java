package com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.B4Z;
import X.C05A;
import X.C0eB;
import X.C194848jk;
import X.C1JX;
import X.C25813BbU;
import X.C26056Bfj;
import X.C26077Bg6;
import X.C27233Bzs;
import X.C27270C1s;
import X.C28224CcU;
import X.C31200Dnj;
import X.C38687GzS;
import X.C3NX;
import X.C3NY;
import X.C51755Mte;
import X.CPB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.KY2;
import com.instagram.api.schemas.CameraTool;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel.MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1", f = "MagicModBackdropScreenViewModel.kt", i = {}, l = {854}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C38687GzS A02;
    public final /* synthetic */ C38687GzS A03;
    public final /* synthetic */ C25813BbU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(C38687GzS c38687GzS, C38687GzS c38687GzS2, C25813BbU c25813BbU, String str, List list, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = str;
        this.A04 = c25813BbU;
        this.A01 = i;
        this.A02 = c38687GzS;
        this.A03 = c38687GzS2;
        this.A07 = z;
        this.A06 = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str = this.A05;
        C25813BbU c25813BbU = this.A04;
        int i = this.A01;
        return new MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(this.A02, this.A03, c25813BbU, str, this.A06, interfaceC23621Ds, i, this.A07);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        C26077Bg6 A00;
        Object value2;
        C26077Bg6 A002;
        Object value3;
        C26077Bg6 A003;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C31200Dnj c31200Dnj = new C31200Dnj(this.A05, 23);
            C25813BbU c25813BbU = this.A04;
            KY2 ky2 = new KY2(AbstractC25225BEi.A0d(this.A01, ((List) C27270C1s.A00(C25813BbU.A00(c25813BbU)).A02.getValue()).size(), 18), c31200Dnj, this.A02, this.A03, c25813BbU.A07.A00.A03);
            MagicModImageGenerationDataSource magicModImageGenerationDataSource = (MagicModImageGenerationDataSource) c25813BbU.A0C.getValue();
            this.A00 = 1;
            obj = magicModImageGenerationDataSource.A01.AWr(ky2, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        Object obj2 = (C3NY) obj;
        C25813BbU c25813BbU2 = this.A04;
        boolean z = this.A07;
        if (!(obj2 instanceof C3NX)) {
            if (obj2 instanceof C194848jk) {
                C25813BbU.A06(c25813BbU2, (CPB) ((C194848jk) obj2).A00, z);
                C05A c05a = c25813BbU2.A0I;
                do {
                    value3 = c05a.getValue();
                    A003 = C26077Bg6.A00(null, null, null, null, null, (C26077Bg6) value3, null, null, 0, 98303, false, false, false);
                } while (!c05a.AIi(value3, A003));
                c05a.getValue();
                obj2 = AbstractC25227BEk.A0h();
            } else {
                throw B4Z.A00();
            }
        }
        List list = this.A06;
        if (obj2 instanceof C3NX) {
            List list2 = (List) ((C51755Mte) ((C3NX) obj2).A00).A00;
            ArrayList A0q = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0q.add(C28224CcU.A07.A01((C26056Bfj) it.next(), CameraTool.A0L));
            }
            if (A0q.isEmpty()) {
                C25813BbU.A06(c25813BbU2, C27233Bzs.A00, z);
            } else {
                C25813BbU.A09(c25813BbU2, AbstractC001800i.A0S(A0q, list), z);
            }
            C05A c05a2 = c25813BbU2.A0I;
            do {
                value = c05a2.getValue();
                A00 = C26077Bg6.A00(null, null, null, null, null, (C26077Bg6) value, null, null, 0, 98303, false, false, false);
            } while (!c05a2.AIi(value, A00));
            if (AbstractC25225BEi.A0v(c05a2).A0D) {
                AbstractC25231BEo.A1H(c25813BbU2, AbstractC141776au.A00(c25813BbU2), 35);
                do {
                    value2 = c05a2.getValue();
                    A002 = C26077Bg6.A00(null, null, null, null, null, (C26077Bg6) value2, null, null, 0, 65535, false, false, false);
                } while (!c05a2.AIi(value2, A002));
            }
        } else if (!(obj2 instanceof C194848jk)) {
            throw B4Z.A00();
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
