package X;

import android.content.res.Resources;

/* renamed from: X.CUg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27961CUg {
    public final Resources A00;
    public final AbstractC166097bd A01;
    public final C25814BbV A02;

    public final void A00(String str) {
        AbstractC166097bd abstractC166097bd = this.A01;
        if (abstractC166097bd instanceof C167297di) {
            C167297di c167297di = (C167297di) abstractC166097bd;
            if (!c167297di.A0W) {
                this.A02.A0X(c167297di.A0C, str, c167297di.A0k);
                return;
            }
        }
        if (!(abstractC166097bd instanceof C169527hS)) {
            return;
        }
        this.A02.A0X(((C169527hS) abstractC166097bd).A02, str, false);
    }

    public final void A01(String str, String str2, boolean z) {
        this.A02.A0h(str, str2, z);
    }

    public C27961CUg(Resources resources, AbstractC166097bd abstractC166097bd, C25814BbV c25814BbV) {
        AbstractC167017dG.A1R(abstractC166097bd, c25814BbV);
        this.A00 = resources;
        this.A01 = abstractC166097bd;
        this.A02 = c25814BbV;
    }
}
