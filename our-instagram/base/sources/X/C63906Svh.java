package X;

/* renamed from: X.Svh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63906Svh implements InterfaceC65336TiH {
    public final /* synthetic */ C61694RsB A00;

    public C63906Svh(C61694RsB c61694RsB) {
        this.A00 = c61694RsB;
    }

    @Override // X.InterfaceC65336TiH
    public final void DXY(R7U r7u) {
        r7u.A00("void((function() {  if (document.readyState === 'interactive' || document.readyState === 'complete') {    _FBIXLoggingBridge.log('IXLoadingListenerDomContentLoaded:');  } else {    document.addEventListener(        'DOMContentLoaded',        function(){          _FBIXLoggingBridge.log('IXLoadingListenerDomContentLoaded:');        },        false);  }})());");
    }
}
