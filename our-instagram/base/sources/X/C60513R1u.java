package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.R1u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60513R1u extends C2JS implements InterfaceC37288Gbp {
    @Override // X.InterfaceC37288Gbp
    public final ImmutableList Bk4() {
        return getRequiredCompactedTreeListField(2, "ranges", C60512R1t.class, 1730472408);
    }

    @Override // X.InterfaceC37288Gbp
    public final ImmutableList getInlineStyleRanges() {
        return getRequiredCompactedTreeListField(1, "inline_style_ranges", C60511R1s.class, 2002465108);
    }

    public C60513R1u(int i) {
        super(i);
    }

    @Override // X.InterfaceC37288Gbp
    public final String getText() {
        return A07("text");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58319PtB.A0T(AbstractC58322PtE.A0P(), AbstractC166987dD.A0h(C4OO.A02(), C60511R1s.class, "inline_style_ranges", 2002465108), AbstractC166987dD.A0h(C4OO.A02(), C60512R1t.class, "ranges", 1730472408));
    }

    public C60513R1u() {
        super(-1202304398);
    }
}
