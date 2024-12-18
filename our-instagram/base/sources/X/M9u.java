package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class M9u extends LinkedHashMap<MQ8, C46056KaD> implements InterfaceC60602pj {
    public final int A00;
    public final FrameLayout A01;
    public final InterfaceC59992oh A02;
    public final UserSession A03;
    public final C01U A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.01U, X.04D] */
    public M9u(FrameLayout frameLayout, InterfaceC59992oh interfaceC59992oh, UserSession userSession, int i) {
        super(i);
        Object[] objArr;
        C14360o3.A0B(userSession, 3);
        this.A00 = i;
        this.A01 = frameLayout;
        this.A03 = userSession;
        this.A02 = interfaceC59992oh;
        ?? c04d = new C04D();
        if (i == 0) {
            objArr = C01U.A03;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw AbstractC25230BEn.A0n("Illegal Capacity: ", i);
        }
        c04d.A01 = objArr;
        this.A04 = c04d;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof MQ8)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C46056KaD)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof MQ8)) {
            return null;
        }
        return super.get(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof MQ8)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof MQ8)) {
            return null;
        }
        return super.remove(obj);
    }

    public static final Object A00(InterfaceC16820sZ interfaceC16820sZ) {
        try {
            return interfaceC16820sZ.invoke();
        } catch (ClassCastException | IllegalArgumentException | IllegalStateException | NullPointerException e) {
            EnumC12410kj enumC12410kj = EnumC12410kj.A0A;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C0w9.A01(enumC12410kj, "MapAnnotationPlaybackManager", message);
            return null;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        Iterator A14 = AbstractC166997dE.A14(this);
        while (A14.hasNext()) {
            ((C46056KaD) AbstractC31176DnK.A0j(A14)).A02();
        }
        this.A04.clear();
        clear();
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        Iterator A14 = AbstractC166997dE.A14(this);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            ((C46056KaD) A1K.getValue()).A03((MQ8) A1K.getKey(), false);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        Iterator A14 = AbstractC166997dE.A14(this);
        while (A14.hasNext()) {
            ((C46056KaD) AbstractC31176DnK.A0j(A14)).A02();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof MQ8) || !(obj2 instanceof C46056KaD)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
