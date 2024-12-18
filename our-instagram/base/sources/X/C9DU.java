package X;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* renamed from: X.9DU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DU extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DU(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A06 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        switch (this.A07) {
            case 0:
                C15370ps c15370ps = (C15370ps) this.A04;
                Recomposer recomposer = (Recomposer) this.A01;
                C07X c07x = (C07X) this.A03;
                C9DU c9du = new C9DU((View) this.A05, recomposer, (C57W) this.A02, c07x, interfaceC23621Ds, c15370ps);
                c9du.A06 = obj;
                return c9du;
            case 1:
                obj2 = this.A06;
                i = 1;
                return new C9DU(obj2, interfaceC23621Ds, i);
            case 2:
                obj2 = this.A06;
                i = 2;
                return new C9DU(obj2, interfaceC23621Ds, i);
            default:
                obj2 = this.A06;
                i = 3;
                return new C9DU(obj2, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DU) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:209:0x04bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cb A[Catch: Exception -> 0x01f7, all -> 0x0213, TryCatch #5 {Exception -> 0x01f7, blocks: (B:9:0x00ba, B:10:0x00bd, B:11:0x00c5, B:13:0x00cb, B:15:0x00e9, B:17:0x00f7, B:18:0x0101, B:24:0x012a, B:26:0x0141, B:27:0x0143, B:29:0x014e, B:31:0x0152, B:33:0x015e, B:34:0x0167, B:35:0x017b, B:36:0x016d, B:38:0x0175, B:40:0x017e, B:41:0x0197, B:43:0x019d, B:45:0x01ab, B:46:0x01ad, B:47:0x01b1, B:49:0x01b7, B:52:0x01d3, B:54:0x01df, B:56:0x01e8, B:57:0x01c5, B:59:0x01cd, B:65:0x01f0, B:72:0x0046, B:73:0x0049, B:75:0x0066, B:77:0x007e, B:80:0x0088, B:81:0x008b, B:83:0x009b, B:85:0x00a7, B:86:0x0073, B:88:0x0035), top: B:4:0x0010, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x065b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05ee A[Catch: all -> 0x0683, TryCatch #1 {all -> 0x0683, blocks: (B:226:0x05e6, B:228:0x05ee, B:233:0x05fc, B:238:0x05d4, B:243:0x0597, B:245:0x059e, B:247:0x05a2, B:249:0x05b3, B:252:0x060a, B:254:0x060e, B:256:0x0612, B:260:0x061e, B:261:0x0623, B:264:0x055f, B:266:0x0567, B:268:0x0571, B:270:0x057b, B:273:0x0675, B:278:0x0541), top: B:277:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0672 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05fc A[Catch: all -> 0x0683, TRY_LEAVE, TryCatch #1 {all -> 0x0683, blocks: (B:226:0x05e6, B:228:0x05ee, B:233:0x05fc, B:238:0x05d4, B:243:0x0597, B:245:0x059e, B:247:0x05a2, B:249:0x05b3, B:252:0x060a, B:254:0x060e, B:256:0x0612, B:260:0x061e, B:261:0x0623, B:264:0x055f, B:266:0x0567, B:268:0x0571, B:270:0x057b, B:273:0x0675, B:278:0x0541), top: B:277:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x059e A[Catch: all -> 0x0683, TryCatch #1 {all -> 0x0683, blocks: (B:226:0x05e6, B:228:0x05ee, B:233:0x05fc, B:238:0x05d4, B:243:0x0597, B:245:0x059e, B:247:0x05a2, B:249:0x05b3, B:252:0x060a, B:254:0x060e, B:256:0x0612, B:260:0x061e, B:261:0x0623, B:264:0x055f, B:266:0x0567, B:268:0x0571, B:270:0x057b, B:273:0x0675, B:278:0x0541), top: B:277:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012a A[Catch: Exception -> 0x01f7, all -> 0x0213, TryCatch #5 {Exception -> 0x01f7, blocks: (B:9:0x00ba, B:10:0x00bd, B:11:0x00c5, B:13:0x00cb, B:15:0x00e9, B:17:0x00f7, B:18:0x0101, B:24:0x012a, B:26:0x0141, B:27:0x0143, B:29:0x014e, B:31:0x0152, B:33:0x015e, B:34:0x0167, B:35:0x017b, B:36:0x016d, B:38:0x0175, B:40:0x017e, B:41:0x0197, B:43:0x019d, B:45:0x01ab, B:46:0x01ad, B:47:0x01b1, B:49:0x01b7, B:52:0x01d3, B:54:0x01df, B:56:0x01e8, B:57:0x01c5, B:59:0x01cd, B:65:0x01f0, B:72:0x0046, B:73:0x0049, B:75:0x0066, B:77:0x007e, B:80:0x0088, B:81:0x008b, B:83:0x009b, B:85:0x00a7, B:86:0x0073, B:88:0x0035), top: B:4:0x0010, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x060a A[Catch: all -> 0x0683, TRY_ENTER, TryCatch #1 {all -> 0x0683, blocks: (B:226:0x05e6, B:228:0x05ee, B:233:0x05fc, B:238:0x05d4, B:243:0x0597, B:245:0x059e, B:247:0x05a2, B:249:0x05b3, B:252:0x060a, B:254:0x060e, B:256:0x0612, B:260:0x061e, B:261:0x0623, B:264:0x055f, B:266:0x0567, B:268:0x0571, B:270:0x057b, B:273:0x0675, B:278:0x0541), top: B:277:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0567 A[Catch: all -> 0x0683, TryCatch #1 {all -> 0x0683, blocks: (B:226:0x05e6, B:228:0x05ee, B:233:0x05fc, B:238:0x05d4, B:243:0x0597, B:245:0x059e, B:247:0x05a2, B:249:0x05b3, B:252:0x060a, B:254:0x060e, B:256:0x0612, B:260:0x061e, B:261:0x0623, B:264:0x055f, B:266:0x0567, B:268:0x0571, B:270:0x057b, B:273:0x0675, B:278:0x0541), top: B:277:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0675 A[Catch: all -> 0x0683, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0683, blocks: (B:226:0x05e6, B:228:0x05ee, B:233:0x05fc, B:238:0x05d4, B:243:0x0597, B:245:0x059e, B:247:0x05a2, B:249:0x05b3, B:252:0x060a, B:254:0x060e, B:256:0x0612, B:260:0x061e, B:261:0x0623, B:264:0x055f, B:266:0x0567, B:268:0x0571, B:270:0x057b, B:273:0x0675, B:278:0x0541), top: B:277:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x055e A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v32, types: [X.57X] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x02cf -> B:97:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x02d2 -> B:97:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02d9 -> B:98:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x033c -> B:129:0x0352). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0124 -> B:10:0x00bd). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DU(View view, Recomposer recomposer, C57W c57w, C07X c07x, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps) {
        super(2, interfaceC23621Ds);
        this.A07 = 0;
        this.A04 = c15370ps;
        this.A01 = recomposer;
        this.A03 = c07x;
        this.A02 = c57w;
        this.A05 = view;
    }
}
