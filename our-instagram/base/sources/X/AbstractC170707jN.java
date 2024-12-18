package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170707jN implements InterfaceC170717jO {
    public Map A00;

    @Override // X.InterfaceC170717jO
    public final BB3 Aq3() {
        return null;
    }

    @Override // X.InterfaceC170717jO
    public final String BOX() {
        return null;
    }

    @Override // X.InterfaceC170717jO
    public final void A8G(String str, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap());
            this.A00 = map;
        }
        map.put(str, obj);
    }

    @Override // X.InterfaceC170717jO
    public final AbstractC50812Vc Apz() {
        if (this instanceof C170697jM) {
            return ((C170697jM) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC170717jO
    public final Object AvD(String str) {
        Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // X.InterfaceC170717jO
    public final float BbM() {
        Map map = this.A00;
        if (map != null && map.containsKey("parent_height_percent")) {
            return ((Number) this.A00.get("parent_height_percent")).floatValue();
        }
        return -1.0f;
    }

    @Override // X.InterfaceC170717jO
    public final float BbT() {
        Map map = this.A00;
        if (map != null && map.containsKey("parent_width_percent")) {
            return ((Number) this.A00.get("parent_width_percent")).floatValue();
        }
        return -1.0f;
    }

    @Override // X.InterfaceC170717jO
    public final C2V9 BmZ() {
        if (this instanceof C170697jM) {
            return ((C170697jM) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC170717jO
    public final int Bz2() {
        Map map = this.A00;
        if (map != null && map.containsKey("span_size")) {
            return ((Number) this.A00.get("span_size")).intValue();
        }
        return 1;
    }

    @Override // X.InterfaceC170717jO
    public final C27921CSg CFk() {
        if (this instanceof C170837ja) {
            return ((C170837ja) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC170717jO
    public final C170907jh CFn() {
        if (this instanceof C170837ja) {
            return ((C170837ja) this).A02;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC170717jO
    public final int CFw() {
        if (this instanceof C170837ja) {
            return ((C170837ja) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC170717jO
    public final boolean CKq() {
        if (this instanceof C170837ja) {
            return ((C170837ja) this).A03;
        }
        return false;
    }

    @Override // X.InterfaceC170717jO
    public final boolean CVF() {
        Map map = this.A00;
        if (map != null && map.containsKey("is_full_span")) {
            return ((Boolean) this.A00.get("is_full_span")).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC170717jO
    public final boolean Cdm() {
        Map map = this.A00;
        if (map != null && map.containsKey("is_sticky")) {
            return ((Boolean) this.A00.get("is_sticky")).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC170717jO
    public final boolean EGw() {
        if (this instanceof C170697jM) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC170717jO
    public final boolean EGz() {
        if (this instanceof C170837ja) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC170717jO
    public final void Eh5(int i) {
        if (this instanceof C170837ja) {
            C170837ja c170837ja = (C170837ja) this;
            if (!c170837ja.A03) {
                c170837ja.A00 = i;
                return;
            }
            throw new UnsupportedOperationException("Cannot override custom view type.");
        }
        throw new UnsupportedOperationException();
    }
}
