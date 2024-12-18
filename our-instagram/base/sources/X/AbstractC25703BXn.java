package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BXn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25703BXn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final String A00(Resources resources, C51759Mti c51759Mti) {
        ?? r3;
        String string;
        C14360o3.A0B(c51759Mti, 0);
        Iterable iterable = (Iterable) c51759Mti.A01;
        if (iterable != null) {
            List A0X = AbstractC001800i.A0X(iterable);
            r3 = new ArrayList(AbstractC06950Ym.A1E(A0X, 10));
            Iterator it = A0X.iterator();
            while (it.hasNext()) {
                r3.add(A00(resources, ((InterfaceC30952Dj9) it.next()).C5s()));
            }
        } else {
            r3 = C16930sl.A00;
        }
        InterfaceC57865PlV interfaceC57865PlV = (InterfaceC57865PlV) c51759Mti.A00;
        if (interfaceC57865PlV instanceof C51919Mx1) {
            String str = ((C51919Mx1) interfaceC57865PlV).A00;
            CharSequence[] charSequenceArr = (CharSequence[]) r3.toArray(new CharSequence[0]);
            Object[] copyOf = Arrays.copyOf(charSequenceArr, charSequenceArr.length);
            string = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        } else if (interfaceC57865PlV instanceof C51918Mx0) {
            int i = ((C51918Mx0) interfaceC57865PlV).A00;
            CharSequence[] charSequenceArr2 = (CharSequence[]) r3.toArray(new CharSequence[0]);
            string = resources.getString(i, Arrays.copyOf(charSequenceArr2, charSequenceArr2.length));
        } else {
            throw new RuntimeException();
        }
        C14360o3.A07(string);
        return string;
    }

    public static final String A02(C5Tl c5Tl, C51759Mti c51759Mti) {
        C14360o3.A0B(c51759Mti, 0);
        if (C0fH.A02()) {
            C0fH.A01(1080350398, "com.instagram.settings2.core.view.fbtWrapper (Fbt.kt:25)");
        }
        Resources resources = ((Context) c5Tl.AJX(AndroidCompositionLocals_androidKt.A01)).getResources();
        C14360o3.A07(resources);
        String A00 = A00(resources, c51759Mti);
        if (C0fH.A02()) {
            C0fH.A00(1582267144);
        }
        return A00;
    }

    public static String A01(C5Tl c5Tl, C51759Mti c51759Mti) {
        return A02(c5Tl, c51759Mti).toString();
    }

    public static final String A03(Fragment fragment, C51759Mti c51759Mti) {
        AbstractC167017dG.A1N(fragment, c51759Mti);
        Resources A0N = AbstractC166997dE.A0N(fragment);
        C14360o3.A07(A0N);
        return A00(A0N, c51759Mti);
    }
}
