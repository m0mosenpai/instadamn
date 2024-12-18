package X;

import com.facebook.forker.Process;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZ9 extends C2AH {
    public final int A00;
    public final Object A01;

    public EZ9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(exc, 0);
                C0w9.A08("DirectIndividualStackCardGalleryFragment_getRemoteMediaTaskFailed", exc);
                C9GR.A0A(AbstractC31172DnG.A06(this.A01), "error");
                return;
            case 8:
                C33097Ej1 c33097Ej1 = (C33097Ej1) this.A01;
                c33097Ej1.A00 = AbstractC121115e3.A00(c33097Ej1.A03);
                return;
            case 10:
                C33098Ej2 c33098Ej2 = (C33098Ej2) this.A01;
                c33098Ej2.A06 = true;
                c33098Ej2.A0C.Egh(C16930sl.A00);
                AbstractC166997dE.A1Y(c33098Ej2.A0A, true);
                return;
            case 14:
                C14360o3.A0B(exc, 0);
                FK9 fk9 = ((FL1) this.A01).A01;
                C6BQ.A0E(fk9.A00, fk9.A01, exc.getMessage());
                return;
            case Process.SIGTERM /* 15 */:
                C36689GFk c36689GFk = (C36689GFk) this.A01;
                String str = c36689GFk.A06;
                if (str != null && str.length() != 0) {
                    return;
                }
                C35035Fc8 c35035Fc8 = c36689GFk.A0C;
                c36689GFk.A05 = AbstractC166987dD.A1E();
                c36689GFk.A07.clear();
                c35035Fc8.A02(1, 2, 0L);
                c36689GFk.A08 = false;
                C36689GFk.A00(c36689GFk);
                return;
            case 16:
                EIx eIx = (EIx) this.A01;
                EIx.A02(eIx);
                EIx.A05(eIx, C37061GUv.A01(eIx, 13));
                return;
            case 17:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                if (clipsEditMetadataController.A0c) {
                    C9GR.A0F(clipsEditMetadataController.A0q.getActivity(), "upload_new_cover_photo_image_failed", 2131961661);
                }
                ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
                return;
            default:
                super.onFail(exc);
                return;
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        ArrayList A1E;
        switch (this.A00) {
            case 0:
                C6WQ c6wq = ((C32705EaW) this.A01).A02;
                if (c6wq == null) {
                    return;
                }
                c6wq.hide();
                return;
            case Process.SIGTERM /* 15 */:
                C36689GFk c36689GFk = (C36689GFk) this.A01;
                String str = c36689GFk.A06;
                if (str != null && str.length() != 0) {
                    return;
                }
                C35035Fc8 c35035Fc8 = c36689GFk.A0C;
                if (!c35035Fc8.A09) {
                    C5e4 c5e4 = c35035Fc8.A03;
                    if (c5e4 == null) {
                        A1E = AbstractC166987dD.A1E();
                        c36689GFk.A05 = A1E;
                        HashMap hashMap = c36689GFk.A07;
                        c35035Fc8.A03(hashMap);
                        c36689GFk.A07 = hashMap;
                        C14360o3.A0C(c36689GFk.A05, AbstractC111324zv.A00(12));
                        c35035Fc8.A02(1, 0, ((List) r1).size());
                        c36689GFk.A08 = false;
                        C36689GFk.A00(c36689GFk);
                        return;
                    }
                    C35035Fc8.A00(c5e4, c35035Fc8);
                }
                A1E = AbstractC166987dD.A1E();
                List list = c35035Fc8.A08;
                if (list != null) {
                    A1E.addAll(list);
                }
                c36689GFk.A05 = A1E;
                HashMap hashMap2 = c36689GFk.A07;
                c35035Fc8.A03(hashMap2);
                c36689GFk.A07 = hashMap2;
                C14360o3.A0C(c36689GFk.A05, AbstractC111324zv.A00(12));
                c35035Fc8.A02(1, 0, ((List) r1).size());
                c36689GFk.A08 = false;
                C36689GFk.A00(c36689GFk);
                return;
            default:
                super.onFinish();
                return;
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        switch (this.A00) {
            case 0:
                C32705EaW c32705EaW = (C32705EaW) this.A01;
                C6WQ c6wq = c32705EaW.A02;
                if (c6wq == null) {
                    c6wq = AbstractC31174DnI.A0i(c32705EaW.requireContext());
                    c32705EaW.A02 = c6wq;
                }
                AbstractC31176DnK.A13(c32705EaW.requireActivity(), c6wq);
                C6WQ c6wq2 = c32705EaW.A02;
                if (c6wq2 == null) {
                    return;
                }
                C0fJ.A00(c6wq2);
                return;
            case 16:
                EIx.A03((EIx) this.A01);
                return;
            case 17:
                ClipsEditMetadataController.A0G((ClipsEditMetadataController) this.A01, true);
                return;
            default:
                super.onStart();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ef, code lost:
    
        if ((r2 instanceof com.instagram.model.direct.DirectSearchResult) != false) goto L101;
     */
    @Override // X.C2AH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZ9.onSuccess(java.lang.Object):void");
    }
}
