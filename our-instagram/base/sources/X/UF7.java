package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: classes11.dex */
public final class UF7 extends AbstractC10350h1 {
    public final List A00;

    public UF7(AbstractC10360h2 abstractC10360h2, List list) {
        super(abstractC10360h2, 1);
        this.A00 = list;
    }

    @Override // X.AbstractC10350h1
    public final Fragment A01(int i) {
        return (Fragment) ((C09530e4) this.A00.get(i)).A01;
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A00.size();
    }

    @Override // X.AbstractC021208i
    public final CharSequence getPageTitle(int i) {
        return (CharSequence) ((C09530e4) this.A00.get(i)).A00;
    }
}
