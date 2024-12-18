package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService;
import java.util.List;

/* renamed from: X.9DI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DI extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final long A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DI(MiniGalleryCategoriesService miniGalleryCategoriesService, AnonymousClass859 anonymousClass859, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A05 = miniGalleryCategoriesService;
        this.A04 = anonymousClass859;
        this.A03 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            long j = this.A03;
            C19L c19l = (C19L) this.A04;
            return new C9DI((C123545iT) this.A05, (List) this.A01, interfaceC23621Ds, c19l, j);
        }
        C9DI c9di = new C9DI((MiniGalleryCategoriesService) this.A05, (AnonymousClass859) this.A04, interfaceC23621Ds, this.A03);
        c9di.A01 = obj;
        return c9di;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DI) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19960yQ interfaceC19960yQ;
        if (this.A02 != 0) {
            C1JX c1jx = C1JX.A02;
            int i = this.A00;
            try {
                if (i != 0) {
                    if (i == 1) {
                        AbstractC09560e7.A00(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC09560e7.A00(obj);
                long j = this.A03;
                C50119MBt c50119MBt = new C50119MBt(this.A01, this.A04, this.A05, null, 27);
                this.A00 = 1;
                Object A00 = LHL.A00(this, c50119MBt, j);
                if (A00 != c1jx) {
                    return A00;
                }
                return c1jx;
            } catch (C902540k unused) {
                C006802i.A0p.markEventBuilder(1001141275, "").annotate(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, this.A03).report();
                return C0eB.A00;
            }
        }
        C1JX c1jx2 = C1JX.A02;
        int i2 = this.A00;
        if (i2 != 0) {
            if (i2 != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            MiniGalleryCategoriesRepository miniGalleryCategoriesRepository = ((MiniGalleryCategoriesService) this.A05).A02;
            AnonymousClass859 anonymousClass859 = (AnonymousClass859) this.A04;
            long j2 = this.A03;
            this.A01 = interfaceC19960yQ;
            this.A00 = 1;
            obj = miniGalleryCategoriesRepository.A00(anonymousClass859, this, j2);
            if (obj == c1jx2) {
                return c1jx2;
            }
        }
        this.A01 = null;
        this.A00 = 2;
        if (interfaceC19960yQ.emit(obj, this) == c1jx2) {
            return c1jx2;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DI(C123545iT c123545iT, List list, InterfaceC23621Ds interfaceC23621Ds, C19L c19l, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = j;
        this.A04 = c19l;
        this.A01 = list;
        this.A05 = c123545iT;
    }
}
