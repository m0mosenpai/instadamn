package X;

import com.facebook.react.bridge.ModuleHolder;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.TSx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64763TSx implements Iterator {
    public Map.Entry A00 = null;
    public final /* synthetic */ AbstractC64130Szs A01;
    public final /* synthetic */ R3M A02;
    public final /* synthetic */ Iterator A03;

    public C64763TSx(AbstractC64130Szs abstractC64130Szs, R3M r3m, Iterator it) {
        this.A01 = abstractC64130Szs;
        this.A03 = it;
        this.A02 = r3m;
    }

    private void A00() {
        Map.Entry entry;
        while (true) {
            Iterator it = this.A03;
            if (it.hasNext()) {
                entry = AbstractC166987dD.A1K(it);
                SX2 sx2 = (SX2) entry.getValue();
                if (!C62856SUd.A00.useTurboModules() || !sx2.A05) {
                    break;
                }
            } else {
                entry = null;
                break;
            }
        }
        this.A00 = entry;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 == null) {
            A00();
        }
        return AbstractC167007dF.A1W(this.A00);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A00 == null) {
            A00();
        }
        Map.Entry entry = this.A00;
        if (entry != null) {
            A00();
            return new ModuleHolder((SX2) entry.getValue(), new C64818TVi(this.A01, this.A02, AbstractC31172DnG.A17(entry)));
        }
        throw new NoSuchElementException("ModuleHolder not found");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D("Cannot remove native modules from the list");
    }
}
