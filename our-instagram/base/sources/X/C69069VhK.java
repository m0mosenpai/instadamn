package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.VhK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69069VhK {
    public U7W A01;
    public final List A02 = new ArrayList();
    public int A00 = 0;

    public C69069VhK(EnumC1125356h enumC1125356h, MediaComposition mediaComposition, U7W u7w) {
        List<C69688VtY> list = (List) mediaComposition.A00.get(enumC1125356h);
        if (list != null) {
            for (C69688VtY c69688VtY : list) {
                if (c69688VtY.A01.Ej4()) {
                    this.A02.add(c69688VtY.A00);
                }
            }
        }
        Collections.sort(this.A02, new C65903Tw9(5));
        this.A01 = u7w;
    }
}
