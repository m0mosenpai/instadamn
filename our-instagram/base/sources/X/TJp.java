package X;

/* loaded from: classes10.dex */
public final class TJp implements Runnable {
    public final /* synthetic */ C58881QEr A00;

    public TJp(C58881QEr c58881QEr) {
        this.A00 = c58881QEr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.A0F(new C63959Swj(this, 1), "(function () {\n  return getImagesSizes();\n  function getImagesSizes() { \n    const allImgs = document.querySelectorAll('img');\n    const imageToSizes = {};\n    for (let i = 0; i < allImgs.length; i++) {\n\t  const item = allImgs.item(i);\n      const src = item.src;\n      imageToSizes[src] = {width: item.naturalWidth, height: item.naturalHeight}\n    };\n    return imageToSizes;\n  }\n})();", false);
    }
}
