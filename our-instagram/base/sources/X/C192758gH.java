package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.List;

/* renamed from: X.8gH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C192758gH extends C03E implements InterfaceC16620sF {
    public C192758gH(Object obj) {
        super(2, obj, C192748gG.class, "genBloksThemeTemplateContext", "genBloksThemeTemplateContext(Ljava/util/List;Ljava/lang/String;)Lcom/instagram/graphql/instagramschema/calls/BloksThemeTemplateContext;", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        String str = (String) obj2;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(str, 1);
        C2JO c2jo = new C2JO();
        c2jo.A05(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, list);
        c2jo.A09(str, "design_system_name");
        return c2jo;
    }
}
