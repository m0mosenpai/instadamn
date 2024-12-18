package X;

/* renamed from: X.Tat, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64968Tat extends C0YY implements InterfaceC16820sZ {
    public static final C64968Tat A00 = new C64968Tat();

    public C64968Tat() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do = C63376Sin.A0C;
        return AbstractC06930Yk.A05(AbstractC166987dD.A1L("ml-cc-exp-month", AbstractC58321PtD.A15("exp[\\-_\\s]?month|expir.*month|post.*month|card.*month|expm|expmm|mmexp|duedatemonth|ddlexpiremm|ddlccmonth", (java.util.Set) interfaceC09390do.getValue())), AbstractC166987dD.A1L("ml-cc-exp-year", AbstractC58321PtD.A15("exp.*year|expir.*year|credit.*card.*year|post.*year|card.*year|expy|expyy|myexp|duedateyear|ddlexpireyy|ddlccyear", (java.util.Set) interfaceC09390do.getValue())), AbstractC166987dD.A1L("ml-cc-exp", AbstractC58321PtD.A15("ccexp|expirydate|expiry|expiration|^expire$|^expiracy$|expiraci[oó]?n|expirare|expirace|vigencia|expir.*date|exp.*date|card.*expir|(card|expir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|mmaa|mmyy|aayy|(?=.*card)(.*date)|valida[dt]e|card.*validity|validdate|duedate|cdate|cardexp.*|vencimento|sonkullanmatarihi|cardmonthyear", (java.util.Set) interfaceC09390do.getValue())), AbstractC166987dD.A1L("ml-cc-csc", AbstractC58321PtD.A15("cc[\\-_\\s]?csc|card.*code|payment[\\-_\\s:]?ccv|cv[vnc]|secur.*code|card.*secur|(?=.*cartao)(.*codigo)|vericacao|cod.*segur", (java.util.Set) interfaceC09390do.getValue())));
    }
}
