package X;

import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;

/* renamed from: X.9DN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DN extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DN(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C9DN c9dn;
        Object obj4;
        Object obj5;
        int i;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A05) {
            case 0:
                c9dn = new C9DN(this.A04, this.A01, interfaceC23621Ds, 0);
                c9dn.A02 = obj;
                c9dn.A03 = obj2;
                break;
            case 1:
                c9dn = new C9DN((C172897n3) this.A01, (C3NY) this.A02, interfaceC23621Ds);
                c9dn.A03 = obj;
                c9dn.A04 = obj2;
                break;
            case 2:
                obj4 = this.A01;
                obj5 = this.A04;
                i = 2;
                c9dn = new C9DN(obj5, obj4, interfaceC23621Ds, i);
                c9dn.A02 = obj;
                c9dn.A03 = obj2;
                break;
            case 3:
                c9dn = new C9DN((ClipsAudioStore) this.A04, interfaceC23621Ds);
                c9dn.A01 = obj;
                c9dn.A02 = obj2;
                break;
            default:
                obj4 = this.A01;
                obj5 = this.A04;
                i = 4;
                c9dn = new C9DN(obj5, obj4, interfaceC23621Ds, i);
                c9dn.A02 = obj;
                c9dn.A03 = obj2;
                break;
        }
        return c9dn.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x013c, code lost:
    
        r15 = new X.C173757oT(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x047a, code lost:
    
        if (r9 != null) goto L152;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0491  */
    /* JADX WARN: Type inference failed for: r3v88, types: [X.X9T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v90, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [X.OW6, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DN(C172897n3 c172897n3, C3NY c3ny, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A05 = 1;
        this.A01 = c172897n3;
        this.A02 = c3ny;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DN(ClipsAudioStore clipsAudioStore, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A05 = 3;
        this.A04 = clipsAudioStore;
    }
}
