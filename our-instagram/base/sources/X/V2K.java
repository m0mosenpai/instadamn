package X;

/* loaded from: classes11.dex */
public final class V2K extends AbstractC69220Vjn {
    public final C68729Vb8 A00;
    public final X8B A01;
    public final X8C A02;

    public V2K(C69480Vo3 c69480Vo3) {
        super(new W2a(c69480Vo3.A04, c69480Vo3.A0G), c69480Vo3.A08, c69480Vo3.A0A, 100);
        C69391Vmb c69391Vmb;
        String obj;
        C69233Vk1 c69233Vk1 = c69480Vo3.A05;
        if (c69233Vk1 != null) {
            this.A01 = new C70667Wen(new C68963Vf1(c69233Vk1));
            EnumC68173VEr enumC68173VEr = c69233Vk1.A01;
            if (enumC68173VEr != null && (obj = enumC68173VEr.toString()) != null) {
                EnumC68153VDx.A01.get(obj);
            }
            C69390Vma c69390Vma = c69480Vo3.A04;
            if (c69390Vma != null && (c69391Vmb = c69390Vma.A00) != null) {
                this.A02 = new C70668Weo(new C69290Vky(c69391Vmb));
                this.A00 = new C68729Vb8(c69480Vo3.A0A);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public V2K(C69389VmZ c69389VmZ, int i) {
        super(new W2a(c69389VmZ.A01, c69389VmZ.A06), c69389VmZ.A03, c69389VmZ.A04, i);
        C69391Vmb c69391Vmb;
        String obj;
        C69233Vk1 c69233Vk1 = c69389VmZ.A02;
        if (c69233Vk1 != null) {
            this.A01 = new C70667Wen(new C68963Vf1(c69233Vk1));
            EnumC68173VEr enumC68173VEr = c69233Vk1.A01;
            if (enumC68173VEr != null && (obj = enumC68173VEr.toString()) != null) {
                EnumC68153VDx.A01.get(obj);
            }
            C69390Vma c69390Vma = c69389VmZ.A01;
            if (c69390Vma != null && (c69391Vmb = c69390Vma.A00) != null) {
                this.A02 = new C70668Weo(new C69290Vky(c69391Vmb));
                this.A00 = new C68729Vb8(c69389VmZ.A04);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
