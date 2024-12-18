package X;

import android.view.View;
import java.lang.ref.Reference;

/* renamed from: X.Hxg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40498Hxg {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        AbstractC39047HGx abstractC39047HGx;
        Reference reference;
        AbstractC39047HGx abstractC39047HGx2;
        C14360o3.A0C(c6fw.A01(), "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        C6BQ.A0B(c6fq);
        int i = IBP.A00;
        if (A0D != i) {
            if (i != -1 && (reference = (Reference) IBP.A01.get(Integer.valueOf(i))) != null && (abstractC39047HGx2 = (AbstractC39047HGx) reference.get()) != null) {
                abstractC39047HGx2.A0T().A02("scroll");
            }
            Reference reference2 = (Reference) IBP.A01.get(Integer.valueOf(A0D));
            if (reference2 != null && (abstractC39047HGx = (AbstractC39047HGx) reference2.get()) != null) {
                IBP.A00 = A0D;
                INQ A0T = abstractC39047HGx.A0T();
                C38321qM A0R = abstractC39047HGx.A0R();
                A0T.A00(A0R);
                View view = abstractC39047HGx.A00;
                if (view != null) {
                    abstractC39047HGx.A00 = view;
                    ((ViewOnTouchListenerC676833i) abstractC39047HGx.A03.getValue()).start();
                    abstractC39047HGx.A0T().A00(A0R);
                    abstractC39047HGx.A0U(true);
                } else {
                    C14360o3.A0F("viewContent");
                    throw C00O.createAndThrow();
                }
            } else {
                IBP.A00 = -1;
                return null;
            }
        }
        return null;
    }
}
