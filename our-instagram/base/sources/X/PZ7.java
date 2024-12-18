package X;

import android.graphics.Bitmap;
import com.instagram.genai.imageservice.upload.GenAIImageUploadService;

/* loaded from: classes9.dex */
public final class PZ7 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04 = 2;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ7(C68079V9k c68079V9k, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = c68079V9k;
        this.A06 = str;
        this.A00 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A04) {
            case 0:
                return new PZ7((C68079V9k) this.A05, this.A06, interfaceC23621Ds, this.A00);
            case 1:
                return new PZ7((Bitmap) this.A02, (GenAIImageUploadService) this.A05, this.A06, interfaceC23621Ds);
            default:
                return new PZ7((EnumC77173d3) this.A02, (C38321qM) this.A03, (NSU) this.A05, this.A06, interfaceC23621Ds, this.A00);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d3  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZ7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ7) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ7(EnumC77173d3 enumC77173d3, C38321qM c38321qM, NSU nsu, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = nsu;
        this.A06 = str;
        this.A02 = enumC77173d3;
        this.A03 = c38321qM;
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ7(Bitmap bitmap, GenAIImageUploadService genAIImageUploadService, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = genAIImageUploadService;
        this.A06 = str;
        this.A02 = bitmap;
    }
}
