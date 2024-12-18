package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Tao, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64963Tao extends C0YY implements InterfaceC16820sZ {
    public static final C64963Tao A00 = new C64963Tao();

    public C64963Tao() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        InterfaceC09390do interfaceC09390do = C63376Sin.A0C;
        A0Z.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AbstractC58321PtD.A15("[fF]ull.?[nN]ame|[fF]irst.*[lL]ast.*[nN]ame|\\b[nN]ame|\\b[nN]ome|^[nN]ombre[s]$|[aA]pellidos y [nN]ombres|[nN]ombres y [aA]pellidos", AbstractC58322PtE.A12(A0Z, "family-name", AbstractC58321PtD.A15("[fF]amily.?[nN]ame|^[lL]ast.?[nN]ame|\\blname|[sS]urname|^[aA]pellido[s]$\"", AbstractC58322PtE.A12(A0Z, "given-name", AbstractC58321PtD.A15("[gG]iven.?[nN]ame|[fF]irst.?[nN]ame|\\bfname", AbstractC58322PtE.A12(A0Z, "address-level1", AbstractC58321PtD.A15("[rR]egion|[pP]rovince|[sS]tate|[eE]stado", AbstractC58322PtE.A12(A0Z, "address-level2", AbstractC58321PtD.A15("[cC]ity|[tT]own|[cC]idade", AbstractC58322PtE.A12(A0Z, "postal-code", AbstractC58321PtD.A15("[zZ][iI][pP]|[pP]ostal|[pP]ost.*[cC]ode", AbstractC58322PtE.A12(A0Z, "country", AbstractC58321PtD.A15("[cC]ountry", AbstractC58322PtE.A12(A0Z, "address-line1", AbstractC58321PtD.A15("address.*line|address[^\\[]?1|addr[^\\[]?1|[sS]treet|address.*one", AbstractC58322PtE.A12(A0Z, "address-line2", AbstractC58321PtD.A15("address.*line[^\\[]?2|address[^\\[]?2|addr[^\\[]?2|[sS]uite|[aA]partment|address.*two", AbstractC58322PtE.A12(A0Z, "address-line3", AbstractC58321PtD.A15("address.*line[^\\[]?3|address[^\\[]?3|addr[^\\[]?3|line[^\\[]?3|address.*three", AbstractC58322PtE.A12(A0Z, "tel", AbstractC58321PtD.A15("[pP]hone|[\b_][tT]el|[tT]el(f|eph)", AbstractC58322PtE.A12(A0Z, "email", AbstractC58321PtD.A15("[eE][- ]?mail|[uU]ser[\\-_\\s]?[nN]ame", (java.util.Set) interfaceC09390do.getValue()), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)));
        return A0Z.buildOrThrow();
    }
}
