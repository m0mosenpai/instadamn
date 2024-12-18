package X;

/* renamed from: X.5CE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CE extends C0YY implements InterfaceC16620sF {
    public static final C5CE A00 = new C5CE();

    public C5CE() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C71 c71;
        C5C7 c5c7;
        C6MR c6mr = (C6MR) obj;
        C127015of c127015of = (C127015of) obj2;
        Object obj3 = c127015of.A02;
        if (obj3 instanceof C5W4) {
            c71 = C71.Paragraph;
        } else if (obj3 instanceof C5W3) {
            c71 = C71.Span;
        } else if (obj3 instanceof C25790Bb7) {
            c71 = C71.VerbatimTts;
        } else if (obj3 instanceof C27974CUw) {
            c71 = C71.Url;
        } else if (obj3 instanceof C25789Bb6) {
            c71 = C71.Link;
        } else if (obj3 instanceof Bb5) {
            c71 = C71.Clickable;
        } else {
            c71 = C71.String;
        }
        switch (c71.ordinal()) {
            case 0:
                C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                c5c7 = C5C9.A09;
                break;
            case 1:
                C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                c5c7 = C5C9.A0B;
                break;
            case 2:
                C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                c5c7 = C5C9.A0I;
                break;
            case 3:
                C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                c5c7 = C5C9.A0H;
                break;
            case 4:
                C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                c5c7 = C5C9.A06;
                break;
            case 5:
                C14360o3.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                c5c7 = C5C9.A04;
                break;
        }
        obj3 = C5C9.A00(c5c7, c6mr, obj3);
        return AbstractC16960so.A1M(c71, obj3, Integer.valueOf(c127015of.A01), Integer.valueOf(c127015of.A00), c127015of.A03);
    }
}
