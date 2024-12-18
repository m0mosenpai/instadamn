package X;

import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.google.common.collect.LinkedHashMultimap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TSz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64765TSz implements Iterator {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    public C64765TSz(final RSI this$1) {
        this.A03 = 1;
        this.A04 = this$1;
        this.A01 = this$1.A02;
        this.A00 = this$1.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A03 != 0) {
            RSI rsi = (RSI) this.A04;
            if (rsi.A00 == this.A00) {
                if (this.A01 != rsi) {
                    return true;
                }
                return false;
            }
            throw AbstractC58318PtA.A0z();
        }
        if (this.A00 < ((List) this.A04).size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A03 != 0) {
            if (hasNext()) {
                LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) ((InterfaceC65548TmR) this.A01);
                Object value = valueEntry.getValue();
                this.A02 = valueEntry;
                InterfaceC65548TmR interfaceC65548TmR = valueEntry.successorInValueSet;
                interfaceC65548TmR.getClass();
                this.A01 = interfaceC65548TmR;
                return value;
            }
            throw AbstractC58318PtA.A13();
        }
        List list = (List) this.A04;
        int i = this.A00;
        this.A00 = i + 1;
        C63137Sdi c63137Sdi = (C63137Sdi) list.get(i);
        String str = c63137Sdi.A00;
        SX2 sx2 = (SX2) ((Map) this.A02).get(str);
        if (sx2 == null) {
            ReactMarker.logMarker(RhX.A0N, str, 0);
            try {
                NativeModule nativeModule = (NativeModule) c63137Sdi.A01.get();
                ReactMarker.logMarker(RhX.A0M);
                return new ModuleHolder(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(RhX.A0M);
                throw th;
            }
        }
        return new ModuleHolder(sx2, c63137Sdi.A01);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.A03 != 0) {
            RSI rsi = (RSI) this.A04;
            if (rsi.A00 == this.A00) {
                AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A02));
                rsi.remove(((AbstractC918149h) this.A02).getValue());
                this.A00 = rsi.A00;
                this.A02 = null;
                return;
            }
            throw AbstractC58318PtA.A0z();
        }
        throw AbstractC166987dD.A1D("Cannot remove native modules from the list");
    }

    public C64765TSz(LazyReactPackage lazyReactPackage, List list, Map map) {
        this.A03 = 0;
        this.A01 = lazyReactPackage;
        this.A04 = list;
        this.A02 = map;
        this.A00 = 0;
    }
}
