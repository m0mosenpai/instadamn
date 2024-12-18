package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Pji, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57755Pji extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57755Pji(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C57755Pji A02(Object obj, int i) {
        return new C57755Pji(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:574:0x0ebe, code lost:
    
        if (r3 != r20.A01) goto L531;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0859  */
    /* JADX WARN: Type inference failed for: r1v162, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [X.N7x, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v33, types: [X.Ja5] */
    /* JADX WARN: Type inference failed for: r2v35, types: [X.N7w, androidx.fragment.app.Fragment] */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 3942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57755Pji.invoke(java.lang.Object):java.lang.Object");
    }

    public static IgImageView A00(OUY ouy, int i, int i2) {
        IgImageView A00 = OUY.A00(ouy);
        A00.setX(i);
        A00.setY(i2);
        return OUY.A00(ouy);
    }

    public static List A01(Context context, Fragment fragment, int i) {
        return AbstractC16960so.A1Q(new C56122Ovh("description_key", null, context.getString(i)), new C56122Ovh("suggested_section_key", fragment.requireContext().getString(2131965498), null));
    }
}
