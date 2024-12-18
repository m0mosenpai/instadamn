package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.AnW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24147AnW implements InterfaceC1829489p {
    public final int A00;
    public final Object A01;

    public C24147AnW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        if (this.A00 == 0) {
            C14360o3.A0B(drawable, 1);
            C23102AGo c23102AGo = (C23102AGo) this.A01;
            C9ZD c9zd = (C9ZD) c23102AGo.A02.get(drawable);
            if (c9zd != null) {
                c23102AGo.A01.post(new RunnableC24778Ay0(drawable, c9zd, c23102AGo));
            }
        }
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmk(Drawable drawable, int i, float f, float f2) {
        if (this.A00 != 0) {
            C14360o3.A0B(drawable, 1);
            ((View) this.A01).setVisibility(8);
        }
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
    }
}
