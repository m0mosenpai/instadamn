package com.facebook.smartcapture.diagnostic;

import X.JQ0;

/* loaded from: classes10.dex */
public final class DiagnosticInfo {
    public final ImageAnnotation[] imageAnnotations;
    public final PointAnnotation[] pointAnnotations;
    public final PolygonAnnotation[] polygonAnnotations;
    public int previewHeight;
    public int previewWidth;
    public final SegmentAnnotation[] segmentAnnotations;
    public final TextAnnotation[] textAnnotations;

    public final ImageAnnotation[] getImageAnnotations() {
        return this.imageAnnotations;
    }

    public final PointAnnotation[] getPointAnnotations() {
        return this.pointAnnotations;
    }

    public final PolygonAnnotation[] getPolygonAnnotations() {
        return this.polygonAnnotations;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final SegmentAnnotation[] getSegmentAnnotations() {
        return this.segmentAnnotations;
    }

    public final TextAnnotation[] getTextAnnotations() {
        return this.textAnnotations;
    }

    public DiagnosticInfo(ImageAnnotation[] imageAnnotationArr, PolygonAnnotation[] polygonAnnotationArr, PointAnnotation[] pointAnnotationArr, SegmentAnnotation[] segmentAnnotationArr, TextAnnotation[] textAnnotationArr) {
        JQ0.A1O(imageAnnotationArr, polygonAnnotationArr, pointAnnotationArr, segmentAnnotationArr, textAnnotationArr);
        this.imageAnnotations = imageAnnotationArr;
        this.polygonAnnotations = polygonAnnotationArr;
        this.pointAnnotations = pointAnnotationArr;
        this.segmentAnnotations = segmentAnnotationArr;
        this.textAnnotations = textAnnotationArr;
    }

    public final void setPreviewHeight(int i) {
        this.previewHeight = i;
    }

    public final void setPreviewWidth(int i) {
        this.previewWidth = i;
    }
}
