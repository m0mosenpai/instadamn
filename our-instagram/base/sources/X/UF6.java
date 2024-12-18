package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: classes11.dex */
public final class UF6 extends AbstractC10350h1 {
    public List A00;
    public List A01;

    @Override // X.AbstractC10350h1
    public final Fragment A01(int i) {
        return (Fragment) this.A01.get(i);
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A01.size();
    }

    @Override // X.AbstractC021208i
    public final CharSequence getPageTitle(int i) {
        return (CharSequence) this.A00.get(i);
    }
}
