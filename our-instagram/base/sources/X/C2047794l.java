package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.94l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2047794l {
    public final InterfaceC40711ue A00;

    public C2047794l(InterfaceC40711ue interfaceC40711ue) {
        C14360o3.A0B(interfaceC40711ue, 1);
        this.A00 = interfaceC40711ue;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A00(Integer num, String str, String str2, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j) {
        String str3;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        ?? obj = new Object();
        int i = (int) (j / 1000);
        try {
            C2047994n c2047994n = (C2047994n) C2047894m.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
            C2JM c2jm = c2047994n.A00;
            c2jm.A04("use_case", str);
            c2047994n.A03 = true;
            c2jm.A04("use_case_version", str2);
            c2047994n.A04 = true;
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    str3 = "PREDICT";
                } else {
                    String A0g = AnonymousClass001.A0g("task type ", AbstractC225209wj.A00(num), " not allowed");
                    C14360o3.A0B(A0g, 1);
                    throw new Exception(A0g);
                }
            } else {
                str3 = "TRAIN";
            }
            c2jm.A04("flow", str3);
            c2047994n.A02 = true;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Example example = (Example) it.next();
                C2JO c2jo = new C2JO();
                c2jo.A09(example.A00.A01, "context");
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : example.A02.entrySet()) {
                    C2JO c2jo2 = new C2JO();
                    c2jo2.A09((String) entry.getKey(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    c2jo2.A09(((FeatureData) entry.getValue()).A00(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    arrayList2.add(c2jo2);
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList2);
                C14360o3.A07(copyOf);
                c2jo.A05("features", copyOf);
                c2jo.A09(example.A01, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                c2jo.A07(Integer.valueOf(i), "timestamp");
                arrayList.add(c2jo);
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList);
            C14360o3.A07(copyOf2);
            c2jm.A05("examples", copyOf2);
            c2047994n.A01 = true;
            PandoGraphQLRequest build = c2047994n.build();
            final C2048194p c2048194p = new C2048194p(obj, interfaceC16820sZ, interfaceC16660sJ);
            this.A00.ATV(new InterfaceC48212Jk() { // from class: X.94r
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    C2048194p c2048194p2 = C2048194p.this;
                    C14360o3.A0A(th);
                    c2048194p2.onFailure(th);
                }
            }, new InterfaceC48192Ji() { // from class: X.94q
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    C2048194p.this.onSuccess(anonymousClass436);
                }
            }, build);
            return obj;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
