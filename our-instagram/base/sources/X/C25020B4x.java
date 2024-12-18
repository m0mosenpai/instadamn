package X;

import android.graphics.Typeface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.B4x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25020B4x extends HashMap {
    public final int A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C25020B4x(int i) {
        Comparable comparable;
        Comparable A00;
        this.A00 = i;
        switch (i) {
            case 0:
                put("HelveticaNeue-Regular", Typeface.create("sans-serif", 0));
                put("HelveticaNeue-Bold", Typeface.create("sans-serif", 1));
                put("HelveticaNeue-CondensedBold", Typeface.create(MSV.A00(1559), 1));
                put("HelveticaNeue-Light", Typeface.create(MSV.A00(1560), 0));
                put("HelveticaNeue-UltraLight", Typeface.create("sans-serif-thin", 0));
                put("HelveticaNeue-Medium", Typeface.create("sans-serif", 1));
                put("Georgia", Typeface.create("serif", 0));
                put("Roboto-Medium", Typeface.create("sans-serif-medium", 0));
                return;
            case 1:
                put("flow_name", "new_users_meta_flow");
                put(CacheBehaviorLogger.SOURCE, CacheBehaviorLogger.SOURCE);
                comparable = "surface";
                A00 = AbstractC111324zv.A00(1018);
                put(comparable, A00);
                return;
            default:
                AbstractC166997dE.A1T(0, this, 0.5d);
                AbstractC166997dE.A1T(1, this, 0.53d);
                AbstractC166997dE.A1T(2, this, 0.57d);
                AbstractC166997dE.A1T(3, this, 0.61d);
                AbstractC166997dE.A1T(4, this, 0.65d);
                AbstractC166997dE.A1T(5, this, 0.69d);
                AbstractC166997dE.A1T(6, this, 0.72d);
                AbstractC166997dE.A1T(7, this, 0.75d);
                AbstractC166997dE.A1T(8, this, 0.78d);
                AbstractC166997dE.A1T(9, this, 0.81d);
                AbstractC166997dE.A1T(10, this, 0.84d);
                AbstractC166997dE.A1T(11, this, 0.86d);
                AbstractC166997dE.A1T(12, this, 0.88d);
                AbstractC166997dE.A1T(13, this, 0.9d);
                AbstractC166997dE.A1T(14, this, 0.91d);
                AbstractC166997dE.A1T(15, this, 0.93d);
                AbstractC166997dE.A1T(16, this, 0.94d);
                AbstractC166997dE.A1T(17, this, 0.95d);
                AbstractC166997dE.A1T(18, this, 0.96d);
                AbstractC166997dE.A1T(19, this, 0.97d);
                comparable = 20;
                A00 = Double.valueOf(0.98d);
                put(comparable, A00);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto Lb;
                case 8: goto Le;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.String
        L7:
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L7
        Le:
            if (r2 != 0) goto L5
        L10:
            boolean r0 = super.containsKey(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25020B4x.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000b, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L15;
                case 1: goto L5;
                case 2: goto Lb;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto Lb;
                case 7: goto L12;
                case 8: goto Lb;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.String
        L7:
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Lb:
            if (r2 != 0) goto L5
        Ld:
            boolean r0 = super.containsValue(r2)
            return r0
        L12:
            boolean r0 = r2 instanceof java.lang.Double
            goto L7
        L15:
            boolean r0 = r2 instanceof android.graphics.Typeface
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25020B4x.containsValue(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto Lb;
                case 8: goto Le;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.String
        L7:
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L7
        Le:
            if (r2 != 0) goto L5
        L10:
            java.lang.Object r0 = super.get(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25020B4x.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009 A[RETURN] */
    @Override // java.util.HashMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto La;
                case 8: goto Ld;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.String
        L7:
            if (r0 != 0) goto Lf
            return r3
        La:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L7
        Ld:
            if (r2 != 0) goto L5
        Lf:
            java.lang.Object r3 = super.getOrDefault(r2, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25020B4x.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto Lb;
                case 8: goto Le;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.String
        L7:
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L7
        Le:
            if (r2 != 0) goto L5
        L10:
            java.lang.Object r0 = super.remove(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25020B4x.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return super.values();
    }

    public C25020B4x(C54s c54s, int i) {
        this.A00 = i;
        put("params", c54s.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r0 = r4 instanceof java.lang.String;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[RETURN] */
    @Override // java.util.HashMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ boolean remove(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L22;
                case 1: goto L5;
                case 2: goto L2c;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L2c;
                case 7: goto Lb;
                case 8: goto L13;
                default: goto L5;
            }
        L5:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L38
        La:
            return r1
        Lb:
            boolean r0 = r3 instanceof java.lang.Integer
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r4 instanceof java.lang.Double
            goto L29
        L13:
            if (r3 == 0) goto L1b
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            if (r4 == 0) goto L33
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L33
            goto L19
        L22:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r4 instanceof android.graphics.Typeface
        L29:
            if (r0 != 0) goto L33
            return r1
        L2c:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto La
            if (r4 != 0) goto L38
        L33:
            boolean r1 = super.remove(r3, r4)
            return r1
        L38:
            boolean r0 = r4 instanceof java.lang.String
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25020B4x.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public C25020B4x(JSONObject jSONObject) {
        this.A00 = 8;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
    }
}
