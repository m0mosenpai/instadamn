package X;

import com.instagram.avatars.store.AvatarStore;

/* renamed from: X.LWq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48241LWq implements C53O {
    public final /* synthetic */ C53O A00;
    public final /* synthetic */ AbstractC439921h A01;
    public final /* synthetic */ AvatarStore A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C41551w4 A04;
    public final /* synthetic */ C145356gu A05;

    @Override // X.C53O
    public final /* synthetic */ void Cym() {
    }

    public C48241LWq(C53O c53o, AbstractC439921h abstractC439921h, AvatarStore avatarStore, C41181vS c41181vS, C41551w4 c41551w4, C145356gu c145356gu) {
        this.A00 = c53o;
        this.A05 = c145356gu;
        this.A02 = avatarStore;
        this.A01 = abstractC439921h;
        this.A04 = c41551w4;
        this.A03 = c41181vS;
    }

    @Override // X.C53O
    public final void CyY() {
        C145356gu c145356gu = this.A05;
        if (AbstractC167007dF.A1Z(c145356gu.A0I)) {
            c145356gu.A08 = true;
        }
        this.A00.CyY();
    }

    @Override // X.C53O
    public final void Cya() {
        this.A00.Cya();
    }

    @Override // X.C53O
    public final void Cyb() {
        C145356gu c145356gu = this.A05;
        c145356gu.A0B = false;
        AbstractC439921h abstractC439921h = this.A02.A01.A00;
        if (!C14360o3.A0K(abstractC439921h, C125535lz.A00) || C14360o3.A0K(abstractC439921h, this.A01) || !AbstractC167007dF.A1Z(c145356gu.A0I)) {
            c145356gu.A0G.E2Z(this.A03, this.A04, C05F.A0C, false);
        }
    }
}
