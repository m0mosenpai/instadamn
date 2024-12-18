package com.instagram.comments.mvvm.view.viewpoint;

import X.AbstractC111324zv;
import X.AbstractC166097bd;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C05F;
import X.C14360o3;
import X.C166047bW;
import X.C58J;
import X.C58N;
import X.C5E6;
import java.util.List;

/* loaded from: classes5.dex */
public final class CommentRowMerlinModifierElement extends C58N {
    public final int A00;
    public final AbstractC166097bd A01;
    public final C166047bW A02;
    public final List A03;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentRowMerlinModifierElement) {
                CommentRowMerlinModifierElement commentRowMerlinModifierElement = (CommentRowMerlinModifierElement) obj;
                if (!C14360o3.A0K(this.A01, commentRowMerlinModifierElement.A01) || !C14360o3.A0K(this.A02, commentRowMerlinModifierElement.A02) || !C14360o3.A0K(this.A03, commentRowMerlinModifierElement.A03) || this.A00 != commentRowMerlinModifierElement.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C5E6(this.A01, this.A02, this.A03);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5E6 c5e6 = (C5E6) c58j;
        C14360o3.A0B(c5e6, 0);
        AbstractC166097bd abstractC166097bd = this.A01;
        C166047bW c166047bW = this.A02;
        List list = this.A03;
        AbstractC167007dF.A1D(abstractC166097bd, 0, list);
        c5e6.A00 = abstractC166097bd;
        c5e6.A01 = c166047bW;
        c5e6.A04 = list;
        c5e6.A05.A0F(AnonymousClass001.A0R(AbstractC111324zv.A00(832), abstractC166097bd.A00), C05F.A0j, null);
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00;
    }

    public CommentRowMerlinModifierElement(AbstractC166097bd abstractC166097bd, C166047bW c166047bW, List list, int i) {
        this.A01 = abstractC166097bd;
        this.A02 = c166047bW;
        this.A03 = list;
        this.A00 = i;
    }
}
