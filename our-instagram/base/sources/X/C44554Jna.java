package X;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.Jna, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44554Jna extends C2UU {
    public final List A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ViewOnClickListenerC44769Jrq viewOnClickListenerC44769Jrq = (ViewOnClickListenerC44769Jrq) c3oo;
        C14360o3.A0B(viewOnClickListenerC44769Jrq, 0);
        C47558KzT c47558KzT = (C47558KzT) this.A00.get(i);
        C14360o3.A0B(c47558KzT, 0);
        viewOnClickListenerC44769Jrq.A00 = c47558KzT.A01;
        viewOnClickListenerC44769Jrq.A01.setText(c47558KzT.A00);
    }

    public C44554Jna(List list) {
        this.A00 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1322374883);
        int size = this.A00.size();
        C0f9.A0A(1810741360, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        JQ0.A1M(viewGroup);
        return new ViewOnClickListenerC44769Jrq(new TextView(viewGroup.getContext()));
    }
}
